package com.microservice_cart.adapters.driven.jpa.mysql.mapper;

import com.microservice_cart.adapters.driven.jpa.mysql.entity.CartEntity;
import com.microservice_cart.domain.model.Cart;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICartEntityMapper {

    CartEntity cartToCartEntity(Cart cart);

}
