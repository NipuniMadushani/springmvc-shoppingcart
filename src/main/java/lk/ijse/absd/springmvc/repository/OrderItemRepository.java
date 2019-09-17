package lk.ijse.absd.springmvc.repository;


import lk.ijse.absd.springmvc.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Integer> {
}
