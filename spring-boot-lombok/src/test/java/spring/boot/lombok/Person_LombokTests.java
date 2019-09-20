package spring.boot.lombok;

        import org.junit.Assert;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.test.context.junit4.SpringRunner;
        import spring.boot.lombok.model.Person_Lombok;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Person_LombokTests {

    @Autowired
    public Person_Lombok person;

    @Test
    public void Test() {
        person.setName("王小二");
        person.setAge(19);
        person.setDescribe("豆蔻年华，正青春！");
        Assert.assertTrue(person.getAge() == 19);
    }
}
