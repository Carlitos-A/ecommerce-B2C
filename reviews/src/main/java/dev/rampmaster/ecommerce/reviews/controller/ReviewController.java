package dev.rampmaster.ecommerce.reviews.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.rampmaster.ecommerce.reviews.model.ReactionRequest;
import dev.rampmaster.ecommerce.reviews.model.Review;
import dev.rampmaster.ecommerce.reviews.service.ReactionService;
import dev.rampmaster.ecommerce.reviews.service.ReviewService;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    private final ReviewService service;
    private final ReactionService reactionService;

    public ReviewController(ReviewService service,
            ReactionService reactionService) {
        this.service = service;
        this.reactionService = reactionService;
    }

    @GetMapping
    public List<Review> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Review> findById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Review> create(@RequestBody Review entity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Review> update(@PathVariable Long id, @RequestBody Review entity) {
        return service.update(id, entity)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!service.delete(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}/reactions")
    public ResponseEntity<?> react(@PathVariable Long id,
            @RequestBody ReactionRequest request) {

        reactionService.react(id, request.getUserId(), request.getType());

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}/reactions/{userId}")
    public ResponseEntity<?> removeReaction(@PathVariable Long id,
            @PathVariable Long userId) {

        reactionService.removeReaction(id, userId);

        return ResponseEntity.noContent().build();
    }

    
    @GetMapping("/{id}/reactions/stats")
    public ResponseEntity<Map<String, Long>> getStats(@PathVariable Long id) {
        return ResponseEntity.ok(reactionService.getStats(id));
    }
}
