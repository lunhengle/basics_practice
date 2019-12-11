package org.lhl.spring.custom;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author lunhengle
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after
     * construction but before any custom elements are parsed.
     *
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     */
    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
