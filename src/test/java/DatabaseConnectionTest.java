import com.simbirsoft.spectr.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Assert;
import org.junit.Test;

public class DatabaseConnectionTest {
    @Test
    public void databaseConnectionTest() {
        String result;
        String expectedResult = "Participant{id=1, user=User{id=2, name='cabrucas', role=USER}, room=Room{id=1, name='General'}}";
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
            Participant msg = session.get(Participant.class, 1);
            session.getTransaction().commit();
            result = msg.toString();
        }
        Assert.assertEquals(expectedResult, result);
    }
}
