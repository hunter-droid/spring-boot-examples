package spring.boot.lombok.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Person_Lombok {

    private String name;

    private Integer age;

    private String describe;
}
