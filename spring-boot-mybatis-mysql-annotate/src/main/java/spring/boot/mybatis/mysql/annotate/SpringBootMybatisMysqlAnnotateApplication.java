package spring.boot.mybatis.mysql.annotate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("spring.boot.mybatis.mysql.annotate.mapper")
public class SpringBootMybatisMysqlAnnotateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisMysqlAnnotateApplication.class, args);
    }

}
