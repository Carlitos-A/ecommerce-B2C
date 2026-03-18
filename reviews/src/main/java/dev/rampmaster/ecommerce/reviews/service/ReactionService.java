package dev.rampmaster.ecommerce.reviews.service;

import java.util.Map;

import dev.rampmaster.ecommerce.reviews.model.Reaction;
import dev.rampmaster.ecommerce.reviews.model.ReactionType;

public class ReactionService {

    public void react(Long reviewId, Long userId, ReactionType type) {

        Optional<Reaction> existing = repository.findByReviewIdAndUserId(reviewId, userId);

        if (existing.isPresent()) {

            Reaction r = existing.get();
            r.setType(type);
            repository.save(r);

        } else {

            Reaction r = new Reaction();
            r.setReviewId(reviewId);
            r.setUserId(userId);
            r.setType(type);

            repository.save(r);
        }
    }

    public void removeReaction(Long reviewId, Long userId) {
        repository.deleteByReviewIdAndUserId(reviewId, userId);
    }

    public Map<String, Long> getStats(Long reviewId) {

        long likes = repository.countByReviewIdAndType(reviewId, ReactionType.LIKE);
        long dislikes = repository.countByReviewIdAndType(reviewId, ReactionType.DISLIKE);

        return Map.of(
                "likes", likes,
                "dislikes", dislikes,
                "score", likes - dislikes);
    }

}
