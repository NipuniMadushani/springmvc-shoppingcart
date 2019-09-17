package lk.ijse.absd.springmvc.service.impl;

import lk.ijse.absd.springmvc.entity.Product;
import lk.ijse.absd.springmvc.repository.ProductRepository;
import lk.ijse.absd.springmvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product get(int id) {
      return productRepository.findById(id).get();

    }

    @Override
    public List<Product> list() {
        return productRepository.findAll();
    }

    @Override
    public boolean add(Product product) {
        productRepository.save(product);
        return true;
    }

    @Override
    public boolean update(Product product) {
        productRepository.save(product);
        return true;
    }

    @Override
    public List<Product> listActiveProducts() {
        return null;
    }

    @Override
    public List<Product> listActiveProductsByCategory(int categoryId) {
        return null;
    }

    @Override
    public List<Product> getLatestActiveProducts(int count) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
         productRepository.deleteById(id);
         return true;
    }
}
