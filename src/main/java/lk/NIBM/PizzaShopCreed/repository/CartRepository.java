package lk.NIBM.PizzaShopCreed.repository;

import lk.NIBM.PizzaShopCreed.dao.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
