package lk.ijse.absd.springmvc.service.impl;

import lk.ijse.absd.springmvc.entity.Cart;
import lk.ijse.absd.springmvc.repository.CartRepository;
import lk.ijse.absd.springmvc.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;


    @Override
    public boolean deleteAll(List<Cart> allcart) {
        cartRepository.deleteInBatch(allcart);
        return true;
    }
}

