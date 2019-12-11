package org.lhl.spring.custom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lunhengle
 */
public class TestMain {
    public static void main(String[] args) {
        ApplicationContext bf=new ClassPathXmlApplicationContext("test.xml");
        User user= (User) bf.getBean("testBean");
        System.out.println(user.getUserName()+"==="+user.getEmail());
    }
}
