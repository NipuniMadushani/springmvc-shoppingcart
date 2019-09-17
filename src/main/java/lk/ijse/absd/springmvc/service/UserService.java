package lk.ijse.absd.springmvc.service;

import lk.ijse.absd.springmvc.entity.Cart;
import lk.ijse.absd.springmvc.entity.User;

import java.util.List;

public interface UserService {
   public boolean addUser(User user);

    public boolean addCart(Cart cart);

    void updateCart(Cart cart);




    List<Cart> getAllCart();

    void deleteCart(Integer id);

    List<User> getAllUsers();

    User getByUserName(String username);


//    Address getBillingAddreess(User user);
}
