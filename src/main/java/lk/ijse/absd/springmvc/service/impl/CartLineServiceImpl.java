package lk.ijse.absd.springmvc.service.impl;

import lk.ijse.absd.springmvc.entity.CartLine;
import lk.ijse.absd.springmvc.repository.CartLineRepository;
import lk.ijse.absd.springmvc.service.CartLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class CartLineServiceImpl implements CartLineService {
    @Autowired
    private CartLineRepository cartLineRepository;
    @Override
    public void deleteCartLine(Integer id) {
        cartLineRepository.deleteById(id);


    }

    @Override
    public void updateCartLine(CartLine cartLine) {
        cartLineRepository.save(cartLine);

    }

    @Override
    public void addCartLine(CartLine cartLine) {
        cartLineRepository.save(cartLine);

    }

    @Override
    public CartLine searchById(Integer id) {
       return cartLineRepository.findById(id).get();

    }

    @Override
    public List<CartLine> getAll() {
        return cartLineRepository.findAll();
    }
}
