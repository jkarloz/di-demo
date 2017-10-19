package com.jcczdev.web;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Juan Carlos - 2017/10/19
 *
 */
@Component
public class LifeCycleDemoBean
		implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
	
	public LifeCycleDemoBean() {
		System.out.println("## I'm in the LifeCycleBean Constructor");
	}

	/* (non-Javadoc)
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 */
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("## Application Context has been set");

	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.BeanFactoryAware#setBeanFactory(org.springframework.beans.factory.BeanFactory)
	 */
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("## Bean Factory has been set");

	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.BeanNameAware#setBeanName(java.lang.String)
	 */
	@Override
	public void setBeanName(String arg0) {
		System.out.println("## My Bean name is: " + arg0);

	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.DisposableBean#destroy()
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("## The lifecycle bean has been terminated");

	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("## The LifeCycleBean has its properties set");

	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("## The Post Construct annotated method has been called.");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("## The PreDestroy methods has been called.");
	}
	
	public void beforeInit() {
		System.out.println("## Before init - Called by Bean Post Processor");
	}
	
	public void afterInit() {
		System.out.println("## After init - Called by Bean Post Processor");
	}

}
