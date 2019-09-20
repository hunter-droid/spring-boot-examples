package spring.boot.mybatis.mysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.mybatis.mysql.model.Person;
import spring.boot.mybatis.mysql.service.IPerson;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    public IPerson person;

    @RequestMapping(method = RequestMethod.GET)
    public Person get(@RequestParam Integer id) {
        return person.selectByPrimaryKey(id);
    }
}
