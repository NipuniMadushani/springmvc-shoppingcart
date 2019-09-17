package lk.ijse.absd.springmvc.service;

import lk.ijse.absd.springmvc.entity.OrderItem;

import java.util.List;

public interface OrderItemService {
    boolean save(OrderItem orderItem);

    List<OrderItem> getAll();
}
