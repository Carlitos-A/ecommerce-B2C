package dev.rampmaster.ecommerce.reviews.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reactions")
public class Reaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long reviewId;
    private Long userId;

    @Enumerated(EnumType.STRING)
    private ReactionType type;



    public Long getId() {
        return id;
    }

    public Long getReviewId() {
        return reviewId;
    }

    public Long getUserId() {
        return userId;
    }

    public ReactionType getType() {
        return type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setType(ReactionType type) {
        this.type = type;
    }
}