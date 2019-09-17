package lk.ijse.absd.springmvc.service.impl;

import lk.ijse.absd.springmvc.entity.OrderItem;
import lk.ijse.absd.springmvc.repository.OrderItemRepository;
import lk.ijse.absd.springmvc.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;
    @Override
    public boolean save(OrderItem orderItem) {
         orderItemRepository.save(orderItem);
         return true;
    }

    @Override
    public List<OrderItem> getAll() {
        return orderItemRepository.findAll();
    }
}
