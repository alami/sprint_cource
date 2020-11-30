package hibernate_one2many_uni;
import hibernate_one2many_uni.entity.Department;
import hibernate_one2many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import spring_introduction.color;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
//            Department dep = new Department("IT", 1200, 300);
//            Employee emp1 = new Employee("Zaur", "Tregulov",  800);
//            Employee emp2    = new Employee("Alex", "Ivanov", 1000);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);

            session.beginTransaction();

//            session.save(dep);

            Department dep = session.get(Department.class,1);
            System.out.println("Done!");
//            System.out.println(color.BLUE+dep+color.RESET);
//            System.out.println(color.GREEN+dep.getEmps()+color.RESET);

//            department.getEmployee().setEmpDepartment(null);
            session.delete(dep);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
