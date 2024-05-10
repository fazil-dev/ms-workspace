package com.fazil.ms.productservice.service;

import com.fazil.ms.productservice.dto.ProductRequest;
import com.fazil.ms.productservice.dto.ProductResponse;
import com.fazil.ms.productservice.entity.Product;
import com.fazil.ms.productservice.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductResponse createProduct(ProductRequest productRequest) {

        log.info("ProductService: createProduct for the product {}.", productRequest.name());
        Product product = Product.builder()
                .name(productRequest.name())
                .description(productRequest.description())
                .price(productRequest.price())
                .build();

        product = productRepository.save(product);

        ProductResponse productResponse = new ProductResponse(product.getId(), product.getName(),
                product.getDescription(), product.getPrice());
        log.info("ProductService: product {} create with id {}.", product.getName(), product.getId());

        return productResponse;
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();

        return products.stream().map(product -> new ProductResponse(product.getId(), product.getName(),
                product.getDescription(), product.getPrice()))
                .collect(Collectors.toList());
    }
}
