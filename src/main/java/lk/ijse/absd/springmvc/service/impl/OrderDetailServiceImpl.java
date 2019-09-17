package lk.ijse.absd.springmvc.service.impl;

import lk.ijse.absd.springmvc.entity.OrderDetail;
import lk.ijse.absd.springmvc.repository.OrderDetailRepositpry;
import lk.ijse.absd.springmvc.repository.UserRepository;
import lk.ijse.absd.springmvc.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private OrderDetailRepositpry orderDetailRepositpry;
    @Override
    public List<OrderDetail> getAll() {
         return orderDetailRepositpry.findAll();
    }

    @Override
    public boolean save(OrderDetail orderDetail) {
         orderDetailRepositpry.save(orderDetail);
         return  true;
    }
}
