package com.example.productcatalogueservice.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.productcatalogueservice.models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
	
	 Optional<Product> findProductById(Long id);
	
	 Product save(Product p);

	    List<Product> findAll();


}
