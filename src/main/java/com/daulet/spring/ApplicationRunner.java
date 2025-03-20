package com.daulet.spring;

import com.daulet.spring.database.pool.ConnectionPool;
import com.daulet.spring.database.repository.CompanyRepository;
import com.daulet.spring.database.repository.UserRepository;
import com.daulet.spring.ioc.Conrainer;
import com.daulet.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
//        var container = new Conrainer();
//
////        var connectionPool = new ConnectionPool();
////        var userRepository = new UserRepository(connectionPool);
////        var companyRepository = new CompanyRepository(connectionPool);
////        var userService = new UserService(userRepository, companyRepository);
//
////        var connectionPool = container.get(ConnectionPool.class);
////        var userRepository = container.get(UserRepository.class);
////        var companyRepository = container.get(CompanyRepository.class);
//        var userService = container.get(UserService.class);

        var context = new ClassPathXmlApplicationContext("application.xml");
        var connectionPool = context.getBean("pool1", ConnectionPool.class);
        System.out.println(connectionPool);
    }
}
