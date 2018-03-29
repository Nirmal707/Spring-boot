package com.kgfsl;

import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class DetailApplication
{
public static void main(String[] args) {
    SpringApplication.run(DetailApplication.class, args);
    
}
@Bean
public ServletRegistrationBean h2ServletRegistration()
{
    ServletRegistrationBean reg=new ServletRegistrationBean(new WebServlet());
    reg.addUrlMappings("/db/*");
    return reg;

}
}