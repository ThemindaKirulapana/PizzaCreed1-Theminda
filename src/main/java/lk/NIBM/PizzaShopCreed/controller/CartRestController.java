package lk.NIBM.PizzaShopCreed.controller;


import lk.NIBM.PizzaShopCreed.dao.Cart;
import lk.NIBM.PizzaShopCreed.dao.DTO.CartItemDTO;
import lk.NIBM.PizzaShopCreed.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CartRestController {

    @Autowired
    ICartService cartService;


    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    @ResponseBody
    public List<Cart> getCarts() {
        return cartService.findAll();
    }

    @PostMapping("/cart")
    public List<CartItemDTO> createBasket(@RequestBody List<CartItemDTO> cartItems) {
        return cartService.saveAll(cartItems);
    }

    @RequestMapping(value = "/cart/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public boolean deleteBasket(@PathVariable Long id) {
        return cartService.delete(id);
    }
}
