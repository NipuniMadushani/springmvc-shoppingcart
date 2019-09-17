package lk.ijse.absd.springmvc.service;

import lk.ijse.absd.springmvc.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> searchCategory(String name);
    List<Category>searchCategoryByName(String id);

    List<Category> list();
    Category get(int id);
    boolean addCategory(Category category);

    boolean update(Category category);
//    boolean delete(Category category);

    boolean delete(Integer id);
}
