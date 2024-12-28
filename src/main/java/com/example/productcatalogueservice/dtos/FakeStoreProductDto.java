package com.example.productcatalogueservice.dtos;

import com.example.productcatalogueservice.models.Category;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FakeStoreProductDto {

    private Long id;
    private String description;
    private String image;
    private String category;
    private Double price;
    private String title;


}
