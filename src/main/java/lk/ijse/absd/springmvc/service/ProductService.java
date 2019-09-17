package lk.ijse.absd.springmvc.service;

import lk.ijse.absd.springmvc.entity.Product;

import java.util.List;

public interface ProductService {
    Product get(int id);
    List<Product> list();
    boolean add(Product product);
    boolean update(Product product);
//    boolean delete(Product product);

    //business methods

    List<Product> listActiveProducts();
    List<Product> listActiveProductsByCategory(int categoryId);
    List<Product> getLatestActiveProducts(int count);

    boolean delete(Integer id);
}
