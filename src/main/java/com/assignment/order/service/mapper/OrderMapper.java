package com.assignment.order.service.mapper;

import com.assignment.order.dto.OrderDto;
import com.assignment.order.entity.Order;

public class OrderMapper {


  public static OrderDto orderDtoMapper(final Order order) {
    final OrderDto orderDto = new OrderDto();
    orderDto.setCustomerName(order.getCustomerName());
    orderDto.setOrderDate(order.getOrderDate());
    orderDto.setShippingAddress(order.getShippingAddress());
    orderDto.setTotal(order.getTotal());
    return orderDto;
  }

  public static Order orderMapper(final OrderDto orderDto) {
    final Order order = new Order();
    order.setCustomerName(orderDto.getCustomerName());
    order.setOrderDate(orderDto.getOrderDate());
    order.setShippingAddress(orderDto.getShippingAddress());
    order.setTotal(orderDto.getTotal());
    return order;
  }
}
