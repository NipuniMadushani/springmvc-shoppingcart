package lk.ijse.absd.springmvc.service;

import lk.ijse.absd.springmvc.entity.CartLine;

import java.util.List;

public interface CartLineService {
    void deleteCartLine(Integer id);

    void updateCartLine(CartLine cartLine);

    void addCartLine(CartLine cartLine);

    CartLine searchById(Integer id);

    List<CartLine> getAll();
}
