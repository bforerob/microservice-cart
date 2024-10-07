package com.microservice_cart.domain.spi;

import com.microservice_cart.domain.model.Cart;

public interface ICartPersistencePort {

    void createCart(Cart cart);

}
