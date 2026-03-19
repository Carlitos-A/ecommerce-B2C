package dev.rampmaster.ecommerce.reviews.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.rampmaster.ecommerce.reviews.model.Reaction;
import dev.rampmaster.ecommerce.reviews.model.ReactionType;

public interface ReactionRepository
        extends JpaRepository<Reaction, Long> {

    Optional<Reaction> findByReviewIdAndUserId(Long reviewId, Long userId);

    void deleteByReviewIdAndUserId(Long reviewId, Long userId);

    long countByReviewIdAndType(Long reviewId, ReactionType type);
}