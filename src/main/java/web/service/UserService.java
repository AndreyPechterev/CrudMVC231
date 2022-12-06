package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {

    public void addUser(User user);

    public void changeUser(User user);

    public void deleteUser(Long id);

    public List<User> showAllUsers();

    public User getUserById(Long id);
}
