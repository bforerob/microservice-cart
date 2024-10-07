package com.microservice_cart.configuration;

import com.microservice_cart.adapters.driven.jpa.mysql.adapter.CartAdapter;
import com.microservice_cart.adapters.driven.jpa.mysql.mapper.ICartEntityMapper;
import com.microservice_cart.adapters.driven.jpa.mysql.repository.ICartRepository;
import com.microservice_cart.domain.api.ICartServicePort;
import com.microservice_cart.domain.api.usecase.CartUseCase;
import com.microservice_cart.domain.spi.ICartPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfig {

    private final ICartRepository cartRepository;
    private final ICartEntityMapper cartEntityMapper;

    @Bean
    public ICartPersistencePort cartPersistencePort(){
        return new CartAdapter(cartRepository, cartEntityMapper);
    }

    @Bean
    public ICartServicePort cartServicePort() {
        return new CartUseCase(cartPersistencePort());
    }


}
