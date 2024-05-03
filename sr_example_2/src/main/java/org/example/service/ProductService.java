package org.example.service;

import org.example.model.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;

@Service
public class ProductService {


    public Flux<Product> getAllProducts() {
        Product product_1 = new Product();
        product_1.setName("Beer");
        Product product_2 = new Product();
        product_2.setName("Chocolate");

        List<Product> productList = List.of(product_1, product_2);

        return Flux
                .fromStream(productList.stream())
                .delayElements(Duration.ofSeconds(3));
    }
}
