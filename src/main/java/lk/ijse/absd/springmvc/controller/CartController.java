package lk.ijse.absd.springmvc.controller;

import lk.ijse.absd.springmvc.entity.Cart;
import lk.ijse.absd.springmvc.entity.Product;
import lk.ijse.absd.springmvc.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
@CrossOrigin
public class CartController {
    @Autowired
    private CartService cartService;

    @DeleteMapping
    public boolean deleteCart(@RequestBody List<Cart> allcart){
        System.out.println(allcart);
        return cartService.deleteAll(allcart);
    }
}
