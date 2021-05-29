package com.simbirsoft.spectr.dao;

import com.simbirsoft.spectr.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> getAllUsers() {
        List<User> list;
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Query<User> query = session.createQuery("from User", User.class);
        list = query.getResultList();
        session.getTransaction().commit();
        return list;
    }

    @Override
    public User getUser(int id) {
        return null;
    }
}
