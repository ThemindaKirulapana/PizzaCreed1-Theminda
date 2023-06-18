package lk.NIBM.PizzaShopCreed.service;


import lk.NIBM.PizzaShopCreed.dao.User;
import lk.NIBM.PizzaShopCreed.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> findById(Long userid) {
        return userRepository.findById(userid);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User save(User user) {
        User dao = null;
        if (user.getId() == null) {
            dao = new User();
        } else {
            Optional<User> optionalUser = userRepository.findById(user.getId());
            if (optionalUser.isPresent()) {
                dao = optionalUser.get();
            }
        }
        BeanUtils.copyProperties(user, dao);
        dao = userRepository.save(dao);
        user.setId(dao.getId());
        return user;
    }


}
