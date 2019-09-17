package lk.ijse.absd.springmvc.repository;

import lk.ijse.absd.springmvc.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
