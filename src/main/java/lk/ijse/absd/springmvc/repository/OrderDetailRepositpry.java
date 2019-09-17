package lk.ijse.absd.springmvc.repository;

import lk.ijse.absd.springmvc.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepositpry extends JpaRepository<OrderDetail,Long> {
}
