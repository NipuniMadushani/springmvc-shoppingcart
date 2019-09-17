package lk.ijse.absd.springmvc.controller;

import lk.ijse.absd.springmvc.entity.Payment;
import lk.ijse.absd.springmvc.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/payment")
@RestController
@CrossOrigin
public class PaymentController {

    @Autowired

    private PaymentService paymentService;

    @PostMapping
    public boolean savePayment(@RequestBody Payment payment){
        return paymentService.addPayment(payment);

    }

     @GetMapping
    public List<Payment> getAll(){
        return paymentService.getAll();
}

}
