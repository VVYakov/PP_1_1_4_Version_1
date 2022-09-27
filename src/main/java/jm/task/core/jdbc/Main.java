package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Андрей", "Андреевич", (byte) 20);
        userService.saveUser("Вадим", "Вадимович", (byte) 30);
        userService.saveUser("Сергей", "Сергеевич", (byte) 40);
        userService.saveUser("Петр", "Петрович", (byte) 50);
        List<User> strings = userService.getAllUsers();
        for (User s : strings)
            System.out.println(s);
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
