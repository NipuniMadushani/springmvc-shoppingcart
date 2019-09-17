package lk.ijse.absd.springmvc.controller;

import lk.ijse.absd.springmvc.entity.OrderItem;
import lk.ijse.absd.springmvc.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderItem")
@CrossOrigin
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;

    @PostMapping
    public boolean save(@RequestBody OrderItem orderItem){
        System.out.println(orderItem);
        return  orderItemService.save(orderItem);
    }

    @GetMapping
    public List<OrderItem> getAllOrderItems(){
        return orderItemService.getAll();
    }
}
