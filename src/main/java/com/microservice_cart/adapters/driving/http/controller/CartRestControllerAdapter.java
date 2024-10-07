package com.microservice_cart.adapters.driving.http.controller;

import com.microservice_cart.adapters.driven.jpa.mysql.repository.ICartRepository;
import com.microservice_cart.adapters.driving.http.dto.request.CreateCartRequest;
import com.microservice_cart.adapters.driving.http.mapper.request.ICreateCartRequestMapper;
import com.microservice_cart.domain.api.ICartServicePort;
import com.microservice_cart.domain.model.Cart;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartRestControllerAdapter {

    private final ICartServicePort cartService;
    private final ICartRepository cartRepository;

    @PostMapping("/")
    public ResponseEntity<Void> createCart(@RequestParam Long userId) {

        if(!cartRepository.existsByuserId(userId)) {
            Cart cart = new Cart(null, userId, null, null);
            cartService.createCart(cart);
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();




    }

}
