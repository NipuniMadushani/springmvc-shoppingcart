package lk.ijse.absd.springmvc.controller;

import lk.ijse.absd.springmvc.entity.OrderDetail;
import lk.ijse.absd.springmvc.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OrderDetail")
@CrossOrigin
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    @GetMapping
    public List<OrderDetail> getAllOrderDetails(){
       return orderDetailService.getAll();
    }

    @PostMapping
    public  boolean add(@RequestBody OrderDetail orderDetail){
        System.out.println(orderDetail);

        return orderDetailService.save(orderDetail);
    }
}
