package com.microservice_cart.domain.api.usecase;

import com.microservice_cart.domain.api.ICartServicePort;
import com.microservice_cart.domain.model.Cart;
import com.microservice_cart.domain.spi.ICartPersistencePort;

import java.time.LocalDate;

public class CartUseCase implements ICartServicePort {

    private final ICartPersistencePort cartPersistencePort;

    public CartUseCase(ICartPersistencePort cartPersistencePort) {
        this.cartPersistencePort = cartPersistencePort;
    }

    @Override
    public void createCart(Cart cart) {

        cart.setCreated(LocalDate.now());
        cart.setLastUpdate(LocalDate.now());
        cartPersistencePort.createCart(cart);

    }
}
