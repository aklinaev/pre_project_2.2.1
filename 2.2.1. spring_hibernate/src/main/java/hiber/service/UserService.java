package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user, Car bmw);
    List<User> listUsers();

    User getUserByCar(String model, int series);

}
