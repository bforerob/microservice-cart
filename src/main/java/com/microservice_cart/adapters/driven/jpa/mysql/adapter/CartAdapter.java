package com.microservice_cart.adapters.driven.jpa.mysql.adapter;

import com.microservice_cart.adapters.driven.jpa.mysql.mapper.ICartEntityMapper;
import com.microservice_cart.adapters.driven.jpa.mysql.repository.ICartRepository;
import com.microservice_cart.domain.model.Cart;
import com.microservice_cart.domain.spi.ICartPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CartAdapter implements ICartPersistencePort {

    private final ICartRepository categoryRepository;
    private final ICartEntityMapper cartEntityMapper;


    @Override
    public void createCart(Cart cart) {

        categoryRepository.save(cartEntityMapper.cartToCartEntity(cart));

    }
}
