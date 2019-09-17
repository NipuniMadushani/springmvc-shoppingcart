package lk.ijse.absd.springmvc.controller;

import lk.ijse.absd.springmvc.entity.Cart;
import lk.ijse.absd.springmvc.entity.User;
import lk.ijse.absd.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    //add an user
   @PostMapping("/addUser")
    boolean addUser(@RequestBody User user){
        System.out.println(user);
        return userService.addUser(user);
    }


    //add an cart
    @PostMapping("/addCart")
     public boolean addCart(@RequestBody Cart cart){
        System.out.println(cart);
        return  userService.addCart(cart);
    }

    //update Cart
    @PutMapping
    public boolean updateCart(@RequestBody Cart cart){
    userService.updateCart(cart);
    return true;
    }


    @GetMapping("/{username}")
     public User getByName(@PathVariable String username){
       System.out.println("Hai");
      return userService.getByUserName(username);

    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }




    @GetMapping("/getCart")
    public List<Cart> getAllCart(){
      return userService.getAllCart();

    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id){
        userService.deleteCart(id);
        return  true;
    }


}

