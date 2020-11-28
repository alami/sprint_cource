package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import spring_introduction.color;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("Zaur", "Tregulov", "IT", 500);
            Employee emp = new Employee("Elene", "Petrova", "Sales", 800);
            session.beginTransaction();
            session.save(emp);
//            session.getTransaction().commit();

            int myId = emp.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employee = session.get(Employee.class, myId );
            session.getTransaction().commit();

            System.out.println("Done!");
            System.out.println(color.BLUE+employee+color.RESET);
        } finally {
            factory.close();
        }
    }
}
