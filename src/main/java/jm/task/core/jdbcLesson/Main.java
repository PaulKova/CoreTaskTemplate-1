package jm.task.core.jdbcLesson;

import jm.task.core.jdbcLesson.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
//        userService.createUsersTable();

        userService.saveUser("Bob", "Ivakin", (byte) 30);
        userService.saveUser("Ivan", "Nikolos", (byte) 21);
        userService.saveUser("Mike", "Lukas", (byte) 24);
        userService.saveUser("Nadezda", "Babkina", (byte) 67);

//        userService.getAllUsers();
//        userService.removeUserById(1);
//        userService.getAllUsers();

//        userService.cleanUsersTable();
//        userService.dropUsersTable();


    }
}
