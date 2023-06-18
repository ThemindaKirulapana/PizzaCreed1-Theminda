package lk.NIBM.PizzaShopCreed.service;


import lk.NIBM.PizzaShopCreed.dao.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product save(Product product);

    Product find(Long id);

    boolean delete(Long id);
}
