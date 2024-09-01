package com.backend.ecommerce.services.interfaces;

import com.backend.ecommerce.dtos.order.OrderCreateDto;
import com.backend.ecommerce.dtos.order.OrderUpdateDto;

import java.util.List;
import java.util.UUID;

public interface OrderService {
    OrderCreateDto createOrder(OrderCreateDto orderDto);
    List<OrderCreateDto> getAllOrders();
    OrderCreateDto updateOrder(OrderUpdateDto orderDto);
    OrderCreateDto deleteOrder(UUID id);
    List<OrderCreateDto> getOrderByUserId(UUID id);
}
