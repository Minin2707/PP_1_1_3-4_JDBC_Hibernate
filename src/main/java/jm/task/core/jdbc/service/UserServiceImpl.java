package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDaoImpl = new UserDaoHibernateImpl();



    public void createUsersTable() {
        userDaoImpl.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoImpl.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoImpl.saveUser(name, lastName, age);
        System.out.println("User с именем - " + name + " добавлен в базу данных");
    }

    public void removeUserById(long id) {
        userDaoImpl.removeUserById(id);
    }

    public List<User> getAllUsers() {
        for(User user : userDaoImpl.getAllUsers()) {
            System.out.println(user);
        }
        return userDaoImpl.getAllUsers();
    }

    public void cleanUsersTable() {
        userDaoImpl.cleanUsersTable();
    }
}
