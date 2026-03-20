package dev.rampmaster.ecommerce.reviews.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.rampmaster.ecommerce.reviews.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}