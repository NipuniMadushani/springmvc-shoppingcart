package lk.ijse.absd.springmvc.service;

import lk.ijse.absd.springmvc.entity.Cart;

import java.util.List;

public interface CartService {

    boolean deleteAll(List<Cart> allcart);
}
