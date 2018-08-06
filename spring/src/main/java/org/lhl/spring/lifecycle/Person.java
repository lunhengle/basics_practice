package org.lhl.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author lunhengle
 */
public class Person implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public Person() {
        System.out.println("person 构造函数");
    }

    public void myInit() {
        System.out.println("myInit 执行");
    }

    public void myDestroy() {
        System.out.println("myDestroy 执行");
    }

    public void setBeanName(String name) {
        System.out.println("bean name 执行");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("bean factory 执行");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("application context 执行");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet 执行");
    }

    public void destroy() throws Exception {
        System.out.println("destroy 执行");
    }
}
