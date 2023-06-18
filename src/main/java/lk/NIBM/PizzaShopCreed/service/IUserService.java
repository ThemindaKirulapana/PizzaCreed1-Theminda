package lk.NIBM.PizzaShopCreed.service;

import lk.NIBM.PizzaShopCreed.dao.User;

import java.util.Optional;

public interface IUserService {

    Optional<User> findById(Long userId);

    User findByUsername(String username);

    User save(User user);
}
