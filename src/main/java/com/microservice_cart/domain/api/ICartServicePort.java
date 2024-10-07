package com.microservice_cart.domain.api;

import com.microservice_cart.domain.model.Cart;

public interface ICartServicePort {


    void createCart(Cart cart);
}
