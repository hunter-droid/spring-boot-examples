package spring.boot.mybatis.mysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("spring.boot.mybatis.mysql.mapper")
public class SpringBootMybatisMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisMysqlApplication.class, args);
    }

}
