package hibernate_test2;
import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import spring_introduction.color;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
//            Employee employee = new Employee("Zaur", "Tregulov", "IT", 500);
//            Detail detail = new Detail("Baku", "123435345", "zaurtregulov@gmail.com");
//            Employee employee = new Employee("Alex", "Ivanov", "IT", 600);
//            Detail detail = new Detail("Moscow", "987652345", "alex@gmail.com");

//            employee.setEmpDetail(detail);
            session.beginTransaction();
//            session.save(employee);
            Employee employee = session.get(Employee.class,1);
            session.getTransaction().commit();
            System.out.println("Done!");
            System.out.println(color.BLUE+employee+color.RESET);
            System.out.println(color.GREEN+employee.getEmpDetail()+color.RESET);
        } finally {
            session.close();
            factory.close();
        }
    }
}
