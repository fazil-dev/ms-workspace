package com.fazil.ms.orderservice.service;

import com.fazil.ms.orderservice.dto.OrderRequest;
import com.fazil.ms.orderservice.dto.OrderResponse;
import com.fazil.ms.orderservice.entity.Order;
import com.fazil.ms.orderservice.mapper.OrderMapper;
import com.fazil.ms.orderservice.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderResponse placeOrder(OrderRequest orderRequest) {
        log.info("Order service place order method invoked");
        Order order = OrderMapper.toOrder(orderRequest);
        orderRepository.save(order);
        OrderResponse orderResponse = OrderMapper.toOrderResponse(order);
        log.info("Order service place order method finished with order number {}.", orderResponse.orderNumber());
        return orderResponse;
    }


}
