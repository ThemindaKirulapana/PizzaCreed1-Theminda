package lk.NIBM.PizzaShopCreed;

import lk.NIBM.PizzaShopCreed.dao.User;
import lk.NIBM.PizzaShopCreed.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
class PizzaShopCreedApplicationTests {

	@Autowired
	UserRepository userservice;

	@Test
	public void findByUsername() {
		Optional<User> user = Optional.ofNullable(userservice.findByUsername("admin"));
		if (user.isPresent()) {
			System.out.println(user.get().getPassword());
		} else {
			System.out.println("no no no");
		}
	}

}
