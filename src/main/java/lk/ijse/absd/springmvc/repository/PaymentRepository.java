package lk.ijse.absd.springmvc.repository;

import lk.ijse.absd.springmvc.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
