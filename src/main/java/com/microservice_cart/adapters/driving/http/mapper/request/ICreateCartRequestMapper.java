package com.microservice_cart.adapters.driving.http.mapper.request;

import com.microservice_cart.adapters.driving.http.dto.request.CreateCartRequest;
import com.microservice_cart.domain.model.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ICreateCartRequestMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "lastUpdate", ignore = true)
    @Mapping(target = "created", ignore = true)
    Cart createCartRequestToCart(CreateCartRequest createCartRequest);

}
