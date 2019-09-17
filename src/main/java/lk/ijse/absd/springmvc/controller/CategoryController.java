package lk.ijse.absd.springmvc.controller;

import lk.ijse.absd.springmvc.entity.Category;
import lk.ijse.absd.springmvc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Category")
@CrossOrigin
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> getall(){
        return categoryService.list();

    }

    @GetMapping("/{id}")
    public Category get(@PathVariable("id") int id){
        return categoryService.get(id);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return categoryService.delete(id);
    }
}
