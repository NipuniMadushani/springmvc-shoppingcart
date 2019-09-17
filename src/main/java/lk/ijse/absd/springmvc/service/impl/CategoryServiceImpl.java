package lk.ijse.absd.springmvc.service.impl;

import lk.ijse.absd.springmvc.entity.Category;
import lk.ijse.absd.springmvc.repository.CategoryRepository;
import lk.ijse.absd.springmvc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl  implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> list() {
        return categoryRepository.findAll();
    }

    @Override
    public Category get(int id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public List<Category> searchCategory(String name) {
        return null;
    }

    @Override
    public List<Category> searchCategoryByName(String id) {
        return null;
    }

    @Override
    public boolean addCategory(Category category) {
        categoryRepository.save(category);
        return true;
    }

    @Override
    public boolean update(Category category) {
        categoryRepository.save(category);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        categoryRepository.deleteById(id);
        return true;
    }


}
