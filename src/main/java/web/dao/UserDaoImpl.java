package web.dao;

import org.springframework.stereotype.Repository;
import web.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void changeUser(int id, User changedUser) {
        User user = entityManager.find(User.class,id);
        user.setAge(changedUser.getAge());
        user.setEmail(changedUser.getEmail());
        user.setName(changedUser.getName());
        user.setSurname(changedUser.getSurname());
    }

    @Override
    public void deleteUser(int id) {
        entityManager.remove(getUserById(id));
    }

    @Override
    public List<User> showAllUsers() {
        List<User> users = entityManager.createQuery("select user from User user").getResultList();
        return users;
    }

    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class,id);
    }
}
