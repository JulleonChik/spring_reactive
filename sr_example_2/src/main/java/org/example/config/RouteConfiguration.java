package org.example.config;

import org.example.handler.ProductHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouteConfiguration {
    @Bean
    public RouterFunction<ServerResponse> responseRouterFunction(ProductHandler productHandler) {
        return RouterFunctions
                .route()
                .GET("/products", productHandler::getAll)
                .build();
    }
}
