package com.simbirsoft.spectr;

import com.simbirsoft.spectr.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SpectrApp {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Message.class)
                .addAnnotatedClass(Room.class)
                .addAnnotatedClass(Participant.class)
                .addAnnotatedClass(Role.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();

            session.beginTransaction();
            User user = session.get(User.class, 2);
            session.getTransaction().commit();
            System.out.println(user);
        }
    }
}
