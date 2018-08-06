package org.lhl.spring.config;

import org.lhl.spring.lifecycle.MyBeanPostProcessor;
import org.lhl.spring.lifecycle.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lunhengle
 */
@Configuration
public class ApplicationConfig {
    @Bean(initMethod = "myInit", destroyMethod = "myDestroy")
    public Person person() {
        return new Person();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }

}
