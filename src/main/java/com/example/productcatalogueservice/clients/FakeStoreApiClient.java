package com.example.productcatalogueservice.clients;

import com.example.productcatalogueservice.dtos.FakeStoreProductDto;
import com.example.productcatalogueservice.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public class FakeStoreApiClient {


    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    private  <T> ResponseEntity<T> requestForEntity(String url, HttpMethod httpMethod, @Nullable Object request, Class<T> responseType, Object... uriVariables) throws RestClientException {
        RestTemplate restTemplate = restTemplateBuilder.build();
        RequestCallback requestCallback = restTemplate.httpEntityCallback(request, responseType);
        ResponseExtractor<ResponseEntity<T>> responseExtractor = restTemplate.responseEntityExtractor(responseType);
        return restTemplate.execute(url, httpMethod, requestCallback, responseExtractor, uriVariables);
    }

    public FakeStoreProductDto getProductById(Long productId) {
        
        ResponseEntity<FakeStoreProductDto> fakeStoreProductDtoEntity = requestForEntity("https://fakestoreapi.com/products/{productId}",HttpMethod.GET,null, FakeStoreProductDto.class, productId);
        return validateFakeStoreResponse(fakeStoreProductDtoEntity);

    }

    public FakeStoreProductDto validateFakeStoreResponse(ResponseEntity<FakeStoreProductDto> fakeStoreProductDtoEntity) {

        if (fakeStoreProductDtoEntity.getStatusCode().equals(HttpStatusCode.valueOf(200))&&fakeStoreProductDtoEntity.getBody()!=null) {
            return fakeStoreProductDtoEntity.getBody();
        }
        return null;
    }
}
