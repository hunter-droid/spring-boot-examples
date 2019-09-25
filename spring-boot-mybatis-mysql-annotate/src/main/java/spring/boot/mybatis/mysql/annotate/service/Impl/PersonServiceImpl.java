package spring.boot.mybatis.mysql.annotate.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.mybatis.mysql.annotate.mapper.PersonMapper;
import spring.boot.mybatis.mysql.annotate.model.Person;
import spring.boot.mybatis.mysql.annotate.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public Person selectByPrimaryKey(Integer id) {
        return personMapper.selectByPrimaryKey(id);
    }
}
