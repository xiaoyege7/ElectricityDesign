package xyz.xiaoye.springbootdemo03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication //(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
//@ComponentScan(basePackages = "xyz.xiaoye.springbootdemo03.dao")
@MapperScan(basePackages = "xyz.xiaoye.springbootdemo03.dao")
public class Springbootdemo03Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootdemo03Application.class, args);
    }

}
