package com.example.productcatalogueservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.productcatalogueservice.models.Product;
import com.example.productcatalogueservice.repo.ProductRepo;

public class StorageProductService implements IProductService {

	@Autowired
	private ProductRepo productRepo;
	@Override
	public Product getProductById(Long productId) {
		Optional<Product> productOptional= productRepo.findProductById(productId);
		if(productOptional.isEmpty())
		{
			return null;
		}
		
		return productOptional.get();
	}

	@Override
	public Product createProduct(Product product) {
		
		return productRepo.save(product);
	}

	@Override
	public Product replaceProduct(Long productId, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

}
