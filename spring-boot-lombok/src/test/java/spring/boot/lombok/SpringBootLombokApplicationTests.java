package spring.boot.lombok;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.boot.lombok.model.Person;

import java.text.MessageFormat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootLombokApplicationTests {

    @Test
    public void contextLoads() {


    }

    public String test() {
        Person person = new Person();
        person.setName("王小二");
        person.setAge(19);
        person.setDscribe("豆蔻年华，正青春！");
        return MessageFormat.format("{0},{1}岁,{2}", person.getName(), person.getAge(), person.getDscribe());
    }

}
