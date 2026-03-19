package dev.rampmaster.ecommerce.reviews.model;

public class Reaction {

    private Long id;
    private Long reviewId;
    private Long userId;
    private ReactionType type;

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
