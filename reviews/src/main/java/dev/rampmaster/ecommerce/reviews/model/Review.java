package dev.rampmaster.ecommerce.reviews.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id", nullable = false)
    private Long productId;

    @Column(nullable = false)
    private Integer rating;

    @Column(length = 500)
    private String comment;

    private LocalDateTime horaCreacion;

    private Long userId;

    private String status;

    private Integer likes;

    private Integer dislikes;

    public Review() {
    }

    public Review(Long id, Long productId, Integer rating, String comment,
                  LocalDateTime horaCreacion, Long userId, String status,
                  Integer likes, Integer dislikes) {
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

    public Long getProductId() {
        return productId;
    }

    public Integer getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public LocalDateTime getHoraCreacion() {
        return horaCreacion;
    }

    public Long getUserId() {
        return userId;
    }

    public String getStatus() {
        return status;
    }

    public Integer getLikes() {
        return likes;
    }

    public Integer getDislikes() {
        return dislikes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setHoraCreacion(LocalDateTime horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }
}