package hibernate_many2many;
import hibernate_many2many.entity.Child;
import hibernate_many2many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import spring_introduction.color;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();

//            Section section1 = new Section("Football");
//            Child child1 = new Child("Zaur", 5);
//            Child child2 = new Child("Masha", 7);
//            Child child3 = new Child("Vasya", 6);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);

//            Child child1 = new Child("Igor", 10);
//            Section section1 = new Section("Volleball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section2);

            session.beginTransaction();

//            session.save(section1);
//            session.save(child1);
            Child child = session.get(Child.class,1);
            System.out.println(color.BLUE+child);
            System.out.println(child.getSections());
//            Section section = session.get(Section.class,4);
//            System.out.println(color.BLUE+section);
//            System.out.println(section.getChildren());

            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
