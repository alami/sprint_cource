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
// 3           Department dep = new Department("IT", 1200, 300);
//            Employee emp1 = new Employee("Zaur", "Tregulov",  800);
//            Employee emp2 = new Employee("Alex", "Ivanov", 1000);
//            Employee emp3 = new Employee("Elena", "Smirnova", 1200);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);

            session.beginTransaction();
           Department dep = session.get(Department.class,5);
//            Employee emp = session.get(Employee.class, 1);

//3            session.save(dep);

            System.out.println("Done!");
//            System.out.println(color.BLUE+emp+color.RESET);
//            System.out.println(color.GREEN+emp.getDepartment()+color.RESET);
            System.out.println(color.BLUE+dep+color.RESET);
            dep.getEmps().get(0);//только чтобы подгрузить LASY до session...COMMIT-а :)
//
//            department.getEmployee().setEmpDepartment(null);
  ///          session.delete(emp);

            session.getTransaction().commit();
            System.out.println(color.GREEN+dep.getEmps()+color.RESET);
        } finally {
            session.close();
            factory.close();
        }
    }
}
