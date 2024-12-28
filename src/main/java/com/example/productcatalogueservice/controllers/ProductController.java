package com.example.productcatalogueservice.controllers;

import com.example.productcatalogueservice.dtos.CategoryDto;
import com.example.productcatalogueservice.dtos.ProductDto;
import com.example.productcatalogueservice.models.Category;
import com.example.productcatalogueservice.models.Product;
import com.example.productcatalogueservice.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<Product>();
        Product product = new Product();
        product.setId(1l);
        product.setName("name");

        products.add(product);
        return products;
    }
    @GetMapping("{productId}")
    public ResponseEntity<ProductDto> findProductById(@PathVariable Long productId){
    	try {
    		  if(productId<=0)
    	            throw  new IllegalArgumentException("Please try with productid >0");
    	        Product product=productService.getProductById(productId);
    	        if(product==null)
    	            return new ResponseEntity<>(null,HttpStatus.valueOf(400));

    	        return new ResponseEntity<>(from(product), HttpStatus.OK);
		} catch (Exception e) {
			throw e;
		}
	
      
    }
    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        Product input = from(productDto);
        Product output = null; //productService2.save(input);
        return null;

    }
    @PutMapping("{productId}")
    public ProductDto  replaceProduct(@PathVariable Long productId,@RequestBody ProductDto request){

        Product productRequest = from(request);
        Product product  = productService.replaceProduct(productId,productRequest);
        return  from(product);

    }

    private ProductDto from (Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setDescription(product.getDescription());
        productDto.setPrice(product.getPrice());
        productDto.setImageUrl(product.getImageUrl());
        if(product.getCategory() != null) {
            CategoryDto categoryDto = new CategoryDto();
            categoryDto.setName(product.getCategory().getName());
            categoryDto.setId(product.getCategory().getId());
            categoryDto.setDescription(product.getCategory().getDescription());
            productDto.setCategory(categoryDto);
        }
        return productDto;
    }
    private Product from(ProductDto productDto) {
        Product product = new Product();
//        product.setCreatedAt(new Date());
//        product.setLastUpdatedAt(new Date());
//        product.setState(State.ACTIVE);
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setImageUrl(productDto.getImageUrl());
        product.setDescription(productDto.getDescription());
        if(productDto.getCategory() != null) {
            Category category = new Category();
            category.setId(productDto.getCategory().getId());
            category.setName(productDto.getCategory().getName());
            product.setCategory(category);
        }
        return product;
    }


}
