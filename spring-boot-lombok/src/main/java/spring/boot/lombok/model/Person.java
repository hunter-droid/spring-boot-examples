package spring.boot.lombok.model;


public class Person {

    private String name;

    private Integer age;

    private String describe;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDscribe() {
        return describe;
    }

    public void setDscribe(String describe) {
        this.describe = describe;
    }

}
