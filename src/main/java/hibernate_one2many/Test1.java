package hibernate_one2many;
import hibernate_one2many.entity.Department;
import hibernate_one2many.entity.Employee;
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
//2           Department dep = session.get(Department.class,1);
            Employee emp = session.get(Employee.class, 1);

//            session.save(dep);

            System.out.println("Done!");
            System.out.println(color.BLUE+emp+color.RESET);
            System.out.println(color.GREEN+emp.getDepartment()+color.RESET);
//2            System.out.println(color.BLUE+dep+color.RESET);
//2            System.out.println(color.GREEN+dep.getEmps()+color.RESET);
//
//            department.getEmployee().setEmpDepartment(null);
            session.delete(emp);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
