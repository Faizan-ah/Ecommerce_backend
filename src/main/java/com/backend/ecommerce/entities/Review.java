package com.backend.ecommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "review", schema = "ecomapp")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Review {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "product_id", nullable = false)
  private Product product;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  @Column(name = "review", nullable = false, columnDefinition = "TEXT")
  private String review;

  @Column(name = "rating", columnDefinition = "NUMERIC(2,1)")
  private float rating;

  @Column(name = "images", columnDefinition = "TEXT[]")
  private List<String> images;

  @Column(name = "date_time", nullable = false, columnDefinition = "TIMESTAMP(6) WITHOUT TIME ZONE")
  private LocalDateTime dateTime;
}