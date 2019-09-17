package lk.ijse.absd.springmvc.service.impl;

import lk.ijse.absd.springmvc.entity.Cart;
import lk.ijse.absd.springmvc.entity.User;
import lk.ijse.absd.springmvc.repository.CartRepository;
import lk.ijse.absd.springmvc.repository.UserRepository;
import lk.ijse.absd.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;



    @Autowired
    private CartRepository cartRepository;
    @Override
    public boolean addUser(User user) {
        userRepository.save(user);
        return true;
    }


    @Override
    public boolean addCart(Cart cart) {
        cartRepository.save(cart);
        return true;
    }

    @Override
    public void updateCart(Cart cart) {
        cartRepository.save(cart);

    }

    @Override
    public List<Cart> getAllCart() {
        return cartRepository.findAll();
    }

    @Override
    public void deleteCart(Integer id) {
         cartRepository.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }



    @Override
    public User getByUserName(String username) {
        return userRepository.findByUsername(username).get();
    }

}
