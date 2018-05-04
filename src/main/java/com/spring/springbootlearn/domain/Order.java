package com.spring.springbootlearn.domain;

import java.time.LocalDate;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Order {
    private LocalDate orderDate;
    private BigDecimal orderPrice;

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }
}