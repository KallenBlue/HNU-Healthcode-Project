package com.zishala.healthcode;

import com.zishala.healthcode.dao.UserDao;
import com.zishala.healthcode.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HealthcodeApplicationTests {
  @Autowired
  UserDao userDao;
  @Test
  void contextLoads() {
//    User user = new User();
//    user.setHealth_code("3345");
//    user.setHealth_state("g");
//    user.setUser_phone_number("18328204393");
//    user.setUser_id_card("513901200205026410");
//    userDao.insert(user);
    User user1 = userDao.selectById("1586214729214914561");
    System.out.println(user1);
  }

}
