package lk.ijse.absd.springmvc.service;

import lk.ijse.absd.springmvc.entity.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetail> getAll();

    boolean save(OrderDetail orderDetail);
}
