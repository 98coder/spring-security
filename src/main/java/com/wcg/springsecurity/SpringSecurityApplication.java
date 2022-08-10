package com.wcg.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.web.DefaultSecurityFilterChain;

import javax.servlet.Filter;
import java.util.List;

@SpringBootApplication
public class SpringSecurityApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringSecurityApplication.class, args);
        DefaultSecurityFilterChain chain = run.getBean(DefaultSecurityFilterChain.class);
        List<Filter> filters = chain.getFilters();
        System.out.println(filters);
    }

}
