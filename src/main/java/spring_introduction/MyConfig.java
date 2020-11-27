package spring_introduction;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("spring_introduction")
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }
    @Bean
    public Person person () {
        return new Person(catBean());
    }
}
