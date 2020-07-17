package com.assignment.order.service;

import com.assignment.order.dto.OrderDto;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {

  OrderDto findById(final Long id);

  List<OrderDto> findAll();

  OrderDto createOrder(final OrderDto orderDto);


}
