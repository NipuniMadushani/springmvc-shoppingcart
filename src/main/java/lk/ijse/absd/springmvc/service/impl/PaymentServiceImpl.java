package lk.ijse.absd.springmvc.service.impl;

import lk.ijse.absd.springmvc.entity.Payment;
import lk.ijse.absd.springmvc.repository.PaymentRepository;
import lk.ijse.absd.springmvc.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {
    @Autowired

    private PaymentRepository paymentRepository;
    @Override
    public boolean addPayment(Payment payment) {
        paymentRepository.save(payment);
        return true;
    }


    @Override
    public List<Payment> getAll() {
        return paymentRepository.findAll();
    }


}
