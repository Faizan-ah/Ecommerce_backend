package com.backend.ecommerce.services.mappers;

import com.backend.ecommerce.entities.Order;
import com.backend.ecommerce.services.dtos.OrderDto;
import com.backend.ecommerce.services.utilities.Constants;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface OrderMapper {

    @Mapping(source="dateTime", target="dateTime", dateFormat = Constants.SERVER_DATE_FORMAT)
    Order toOrder(OrderDto source);

    @Mapping(source = "dateTime", target = "dateTime", dateFormat = Constants.SERVER_DATE_FORMAT)
    OrderDto toOrderDto(Order source);

    List<OrderDto> toOrderDtos(List<Order> orders);

    List<Order> toOrders(List<OrderDto> orderDtos);
}
