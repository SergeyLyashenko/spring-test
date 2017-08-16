package com.slyashenko.dao;

import com.slyashenko.model.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;



@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    private final DataSource dataSource;

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public User findUser(User user) {
        String hql = "from springusers where name = :name";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString("name", user.getUsername());
        return (User) query.uniqueResult();


    }

    @Override
    public User addUser(User user) {

        Integer userId = (Integer) sessionFactory.getCurrentSession().save(user);
        return (User) sessionFactory.getCurrentSession().get(User.class, userId);
    }
}
