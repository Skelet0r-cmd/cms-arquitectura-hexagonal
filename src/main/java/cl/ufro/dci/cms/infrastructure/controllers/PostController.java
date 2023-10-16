package cl.ufro.dci.cms.infrastructure.controllers;

import cl.ufro.dci.cms.application.services.PostService;
import cl.ufro.dci.cms.domain.model.AdditionalPostInfo;
import cl.ufro.dci.cms.domain.model.Post;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        Post createdPost = postService.createPost(post);
        return new ResponseEntity<>(createdPost, HttpStatus.CREATED);
    }

    @GetMapping("/{postId}")
    public ResponseEntity<Post> getPostById(@PathVariable Integer postId) {
        return postService.getPostById(postId)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<Post>> getAllPosts() {
        List<Post> posts = postService.getAllGPosts();
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }

    @PutMapping("/{postId}")
    public ResponseEntity<Post> updatePost(@PathVariable Integer postId, @RequestBody Post updatedPost) {
        return postService.updatePost(postId, updatedPost)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{postId}")
    public ResponseEntity<Void> deletePostById(@PathVariable Integer postId) {
        if (postService.deletePost(postId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{postId}/additional-info")
    public ResponseEntity<AdditionalPostInfo> getAdditionalPostInfo(@PathVariable Integer postId) {
        AdditionalPostInfo additionalPostInfo = postService.getAdditionalPostInfo(postId);
        return new ResponseEntity<>(additionalPostInfo, HttpStatus.OK);
    }
}
