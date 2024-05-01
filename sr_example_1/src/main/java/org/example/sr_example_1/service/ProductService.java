package org.example.sr_example_1.service;

import org.example.sr_example_1.model.Product;
import org.example.sr_example_1.repository.ProductRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Flux<Product> getAllProducts() {
        return this.productRepository
                .findAll()
                .delayElements(Duration.ofSeconds(5));
    }
}
