package com.example.productcatalogueservice.services;

import com.example.productcatalogueservice.models.Product;

import java.util.List;

public interface IProductService {

     Product getProductById(Long productId);
     Product createProduct(Product product);
     Product replaceProduct(Long productId,Product product);
     List<Product> getAllProducts();

}
