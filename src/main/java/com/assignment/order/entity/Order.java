package com.assignment.order.entity;

import com.assignment.order.constants.EntityConstants;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = EntityConstants.ORDER_TABLE)
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String customerName;

  @Column
  private Date orderDate;

  @Column
  private String shippingAddress;

//  @OneToMany(cascade = CascadeType.ALL,
//      fetch = FetchType.LAZY,
//      mappedBy = EntityConstants.ORDER_MAPPING)
//  @JsonManagedReference
//  private List<OrderItem> orderItems;

  @Column
  private BigDecimal total;

}
