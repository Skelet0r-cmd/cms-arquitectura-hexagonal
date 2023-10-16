package cl.ufro.dci.cms.infrastructure.controllers;

import cl.ufro.dci.cms.application.services.PostMetadatumService;
import cl.ufro.dci.cms.domain.model.PostMetadatum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/postsMetadatums")
public class PostMetadatumController {
    private final PostMetadatumService postMetadatumService;

    public PostMetadatumController() {
        this(null);
    }

    public PostMetadatumController(PostMetadatumService postMetadatumService) {
        this.postMetadatumService = postMetadatumService;
    }

    @PostMapping
    public ResponseEntity<PostMetadatum> createPostMetadatum(@RequestBody PostMetadatum postMetadatum) {
        PostMetadatum createdPostMetadatum = postMetadatumService.createPostMetadatum(postMetadatum);
        return new ResponseEntity<>(createdPostMetadatum, HttpStatus.CREATED);
    }

    @GetMapping("/{postMetadatumId}")
    public ResponseEntity<PostMetadatum> getPostMetadatumById(@PathVariable Integer postMetadatumId) {
        return postMetadatumService.getPostMetadatumById(postMetadatumId)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<PostMetadatum>> getAllPostsMetadatums() {
        List<PostMetadatum> postsMetadatums = postMetadatumService.getAllGPostsMetadatum();
        return new ResponseEntity<>(postsMetadatums, HttpStatus.OK);
    }

    @PutMapping("/{postMetadatumId}")
    public ResponseEntity<PostMetadatum> updatePostMetadatum(@PathVariable Integer postMetadatumId, @RequestBody PostMetadatum updatedPostMetadatum) {
        return postMetadatumService.updatePostMetadatum(postMetadatumId, updatedPostMetadatum)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{postMetadatumId}")
    public ResponseEntity<Void> deletePostMetadatumById(@PathVariable Integer postMetadatumId) {
        if (postMetadatumService.deletePostMetadatum(postMetadatumId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
