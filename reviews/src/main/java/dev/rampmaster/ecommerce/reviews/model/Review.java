package dev.rampmaster.ecommerce.reviews.model;

public class Review {

    private Long id;
    private Long productId;
    private Integer rating;
    private String comment;

    private String horaCreacion;
    private Integer userId;
    private String status;
    private Integer likes;
    private Integer dislikes;


    public Review() {
    }

 public Review(Long id, Long productId, Integer rating, String comment, String horaCreacion, int userId, String status, Integer likes, Integer dislikes) 
    {
        this.id = id;
        this.productId = productId;
        this.rating = rating;
        this.comment = comment;
        this.horaCreacion = horaCreacion;
        this.userId = userId;
        this.status = status;
        this.likes = likes;
        this.dislikes = dislikes;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
            public String gethoraCreacion() {
        return horaCreacion;
    }

    public void setHoraCreacion(String horaCreacion) {
        this.horaCreacion = horaCreacion;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public Integer getDislikes() {
        return dislikes;
    }

    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }
}

