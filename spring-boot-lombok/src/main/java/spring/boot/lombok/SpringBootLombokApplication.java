package spring.boot.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.boot.lombok.model.Person;

@SpringBootApplication
public class SpringBootLombokApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLombokApplication.class, args);
    }

}
