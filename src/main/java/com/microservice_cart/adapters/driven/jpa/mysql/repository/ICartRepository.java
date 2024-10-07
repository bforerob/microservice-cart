package com.microservice_cart.adapters.driven.jpa.mysql.repository;

import com.microservice_cart.adapters.driven.jpa.mysql.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICartRepository extends JpaRepository<CartEntity, Long> {

    boolean existsByuserId(Long userId); // Aquí estamos verificando si ya existe un carrito para el cliente


}
