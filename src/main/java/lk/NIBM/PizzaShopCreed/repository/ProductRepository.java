package lk.NIBM.PizzaShopCreed.repository;

import lk.NIBM.PizzaShopCreed.dao.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
