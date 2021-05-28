import com.simbirsoft.spectr.entity.Message;
import com.simbirsoft.spectr.entity.Participant;
import com.simbirsoft.spectr.entity.Room;
import com.simbirsoft.spectr.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Assert;
import org.junit.Test;

public class DatabaseConnectionTest {
    @Test
    public void databaseConnectionTest() {
        String result = null;
        String expectedResult = "Participant{id=1, user=User{id=2, name='cabrucas'}, room=Room{id=1, name='General'}}";
        try (SessionFactory sessionFactory = new Configuration()
                                                                .configure("hibernate.cfg.xml")
                                                                .addAnnotatedClass(Participant.class)
                                                                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Participant participant = session.get(Participant.class, 1);
            session.getTransaction().commit();
            result = participant.toString();
        }
        Assert.assertEquals(expectedResult, result);
    }
}