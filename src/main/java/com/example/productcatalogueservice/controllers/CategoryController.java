package com.example.productcatalogueservice.controllers;

import com.example.productcatalogueservice.models.Category;
import com.example.productcatalogueservice.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @GetMapping
    public List<Category> getAllCategories() {
        return null;

    }

}
