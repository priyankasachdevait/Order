package com.assignment.order.dto;


import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class OrderDto {

  private String customerName;
  private Date orderDate;
  private String shippingAddress;
  private BigDecimal total;

}
