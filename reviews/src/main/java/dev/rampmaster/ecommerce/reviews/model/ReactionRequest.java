package dev.rampmaster.ecommerce.reviews.model;

public class ReactionRequest {
    private Long userId;
    private ReactionType type;

    public Long getUserId() {
        return userId;
    }

    public ReactionType getType() {
        return type;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setType(ReactionType type) {
        this.type = type;
    }

}
