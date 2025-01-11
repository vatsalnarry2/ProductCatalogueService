package com.example.productcatalogueservice.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Product extends BaseModel {
    private Long id;
    private String description;
    private String name;
  private String imageUrl;
  private Double price;
  @ManyToOne(cascade = CascadeType.ALL)
  private Category category;
  private Boolean isPrime;
}
