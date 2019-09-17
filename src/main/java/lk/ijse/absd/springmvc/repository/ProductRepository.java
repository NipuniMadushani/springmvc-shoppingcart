package lk.ijse.absd.springmvc.repository;

import lk.ijse.absd.springmvc.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
