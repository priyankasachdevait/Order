package com.assignment.order.service.impl;

import com.assignment.order.constants.ErrorMessageConstants;
import com.assignment.order.dto.OrderDto;
import com.assignment.order.entity.Order;
import com.assignment.order.exception.ApplicationException;
import com.assignment.order.repository.OrderRepository;
import com.assignment.order.service.OrderService;
import com.assignment.order.service.mapper.OrderMapper;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class OrderServiceImpl implements OrderService {

  @Autowired
  OrderRepository orderRepository;

  @Override
  public OrderDto findById(Long id) {
    Optional<Order> order = this.orderRepository.findById(id);
    if (!order.isPresent()) {
      throw new ApplicationException(
          String.format(ErrorMessageConstants.ORDER_NOT_FOUND));
    }
    return OrderMapper.orderDtoMapper(order.get());
  }

  @Override
  public List<OrderDto> findAll() {
    List<Order> orders = this.orderRepository.findAll();
    if (CollectionUtils.isEmpty(orders)) {
      throw new ApplicationException(
          String.format(ErrorMessageConstants.NO_ORDERS_FOUND));
    }
    List<OrderDto> orderDto = orders.stream().map(e -> OrderMapper.orderDtoMapper(e))
        .collect(Collectors.toList());
    return orderDto;
  }

  @Override
  @Transactional
  public OrderDto createOrder(final OrderDto orderDto) {
    final Order order = this.orderRepository.save(OrderMapper.orderMapper(orderDto));
    return OrderMapper.orderDtoMapper(order);
  }
}
