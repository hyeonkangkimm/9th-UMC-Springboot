package com.example.umc9th.domain.Review.entity;

import com.example.umc9th.global.entity.Store;
import com.example.umc9th.global.entity.Users;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "review")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // review_id

    private double star;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    // 커스텀 생성자
    public Review(Users user, Store store, double star, String content) {
        this.user = user;
        this.store = store;
        this.star = star;
        this.content = content;
        this.createdAt = LocalDateTime.now();
    }
}
