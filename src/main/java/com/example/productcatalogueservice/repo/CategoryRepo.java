package com.example.productcatalogueservice.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.productcatalogueservice.models.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Long> {
}
