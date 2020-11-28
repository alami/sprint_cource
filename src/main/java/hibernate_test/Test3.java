package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import spring_introduction.color;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> emps = session.createQuery("from Employee").getResultList();
            List<Employee> emps = session.createQuery(
                    "from Employee where name = 'Alex' and salary = 600").getResultList();

            for (Employee e: emps)
                System.out.println(e);

            session.getTransaction().commit();
            System.out.println(color.BLUE+"Done!"+color.RESET);
        } finally {
            factory.close();
        }
    }
}
