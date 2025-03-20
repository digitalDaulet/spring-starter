package com.daulet.spring;

import com.daulet.spring.database.pool.ConnectionPool;
import com.daulet.spring.database.repository.CompanyRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");
        var connectionPool = context.getBean("pool1", ConnectionPool.class);
        System.out.println(connectionPool);

        var companyRepository = context.getBean("companyRepository", CompanyRepository.class);
        System.out.println(companyRepository);
    }
}
