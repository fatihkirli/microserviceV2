package com.example.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @NotNull(message = "customerId is mandatory")
    private Long customerId;
    @NotNull(message = "bookId is mandatory")
    private Long bookId;
    @NotNull(message = "count is mandatory")
    @Min(value = 1, message = "count must be bigger than 0")
    private Integer count;
    @NotNull(message = "amount is mandatory")
    private Double amount;

}
