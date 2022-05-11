package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov", (byte) 25);
        userService.saveUser("Ivan", "Petrov", (byte) 27);
        userService.saveUser("Petr", "Ivanov", (byte) 25);
        userService.saveUser("Petr", "Petrov", (byte) 27);
        userService.removeUserById(1);
        userService.cleanUsersTable();
        List<User> allUsers = userService.getAllUsers();
        for (User user : allUsers) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }

}
