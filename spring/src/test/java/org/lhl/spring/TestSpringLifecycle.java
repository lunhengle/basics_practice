package org.lhl.spring;

import org.junit.Test;
import org.lhl.spring.config.ApplicationConfig;
import org.lhl.spring.lifecycle.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 执行顺序是:
 * <p>
 * person 构造函数
 * bean name 执行
 * bean factory 执行
 * application context 执行
 * postProcessBeforeInitialization 调用
 * afterPropertiesSet 执行
 * myInit 执行
 * postProcessAfterInitialization 调用
 * destroy 执行
 * myDestroy 执行
 */
public class TestSpringLifecycle {

    @Test
    public void testConfig() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Person person = (Person) applicationContext.getBean("person");
        ((AnnotationConfigApplicationContext) applicationContext).registerShutdownHook();
    }
}
