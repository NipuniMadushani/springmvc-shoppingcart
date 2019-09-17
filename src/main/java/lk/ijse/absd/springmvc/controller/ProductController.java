package lk.ijse.absd.springmvc.controller;


import lk.ijse.absd.springmvc.entity.Product;
import lk.ijse.absd.springmvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Column;
import java.util.List;

@RestController
@RequestMapping("/Product")
@CrossOrigin
public class ProductController {

@Autowired
private ProductService productService;
    @GetMapping("/{id}")
    Product get(@PathVariable("id") int id){
        return productService.get(id);
    }

    @GetMapping
    public List<Product> list(){
        return productService.list();
    }

    @PostMapping
    public boolean add(@RequestBody Product product){
        System.out.println(product);
        return productService.add(product);
    }

    @PutMapping
    public boolean update(@RequestBody Product product){
        return productService.update(product);
    }

    @DeleteMapping("/{id}")
   public boolean delete(@PathVariable("id") Integer id){

        return productService.delete(id);
    }

}
