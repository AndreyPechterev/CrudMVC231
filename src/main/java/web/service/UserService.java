package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {

    public void addUser(User user);

    public void changeUser(int id, User changedUser);

    public void deleteUser(int id);

    public List<User> showAllUsers();

    public User getUserById(int id);
}
