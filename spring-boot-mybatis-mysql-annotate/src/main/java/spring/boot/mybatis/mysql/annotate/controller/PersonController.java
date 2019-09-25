package spring.boot.mybatis.mysql.annotate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.mybatis.mysql.annotate.model.Person;
import spring.boot.mybatis.mysql.annotate.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    public Person get(@RequestParam Integer id) {
        return personService.selectByPrimaryKey(id);
    }
}
