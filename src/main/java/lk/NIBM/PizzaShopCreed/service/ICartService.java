package lk.NIBM.PizzaShopCreed.service;


import lk.NIBM.PizzaShopCreed.dao.Cart;
import lk.NIBM.PizzaShopCreed.dao.DTO.CartItemDTO;

import java.util.List;

public interface ICartService {
    Cart save(Cart cart);

    List<Cart> findAll();

    List<CartItemDTO> saveAll(List<CartItemDTO> cartItems);

    boolean delete(Long id);

}
