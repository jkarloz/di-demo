package com.jcczdev.web;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Juan Carlos - 2017/10/19
 *
 */
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof LifeCycleDemoBean) {
			((LifeCycleDemoBean) bean).beforeInit();
		}
		
		return bean;
	}
	
	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof LifeCycleDemoBean) {
			((LifeCycleDemoBean) bean).afterInit();
		}
		return bean;
	}
}
