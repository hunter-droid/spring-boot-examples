package spring.boot.mybatis.mysql.annotate.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import spring.boot.mybatis.mysql.annotate.model.Person;

@Component
public interface PersonMapper {

    @Delete("DELETE FROM person WHERE id =#{id}")
    int deleteByPrimaryKey(Integer id);

    @Insert("INSERT INTO person(name,age,gender,remark) VALUES(#{name}, #{age}, #{gender},#{remark})")
    int insert(Person record);

    @Select("SELECT * FROM person WHERE id = #{id}")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "remark", column = "remark")
    })
    Person selectByPrimaryKey(Integer id);

    @Update("UPDATE person SET name=#{name},age=#{age} WHERE id =#{id}")
    int updateByPrimaryKey(Person record);
}
