package lk.ijse.absd.springmvc.controller;


import lk.ijse.absd.springmvc.entity.CartLine;
import lk.ijse.absd.springmvc.service.CartLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CartLine")
@CrossOrigin
public class CartLineController {

   @Autowired
   private CartLineService cartLineService;

    @GetMapping("/{id}")
    public CartLine get(@PathVariable("id") Integer id){
        return cartLineService.searchById(id);
    }


    @PostMapping
    public  boolean add(@RequestBody CartLine cartLine){
        cartLineService.addCartLine(cartLine);
        return true;
    }

    @PutMapping
    public boolean update(@RequestBody CartLine cartLine){
        cartLineService.updateCartLine(cartLine);
        return true;
    }


    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id){
        cartLineService.deleteCartLine(id);
        return  true;
    }


    @GetMapping
    public List<CartLine> list(){
       return cartLineService.getAll();

    }

}
