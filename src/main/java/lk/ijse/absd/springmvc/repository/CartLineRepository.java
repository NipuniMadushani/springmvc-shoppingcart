package lk.ijse.absd.springmvc.repository;

import lk.ijse.absd.springmvc.entity.CartLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartLineRepository extends JpaRepository<CartLine,Integer> {
}
