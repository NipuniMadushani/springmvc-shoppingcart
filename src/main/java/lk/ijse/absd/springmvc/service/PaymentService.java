package lk.ijse.absd.springmvc.service;

import lk.ijse.absd.springmvc.entity.Payment;

import java.util.List;

public interface PaymentService {
    boolean addPayment(Payment payment);

    List<Payment> getAll();
}
