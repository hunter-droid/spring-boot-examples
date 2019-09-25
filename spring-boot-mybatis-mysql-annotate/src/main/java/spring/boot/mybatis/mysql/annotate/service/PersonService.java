package spring.boot.mybatis.mysql.annotate.service;

import spring.boot.mybatis.mysql.annotate.model.Person;

public interface PersonService {

    Person selectByPrimaryKey(Integer id);
}
