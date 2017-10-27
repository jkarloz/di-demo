package com.jcczdev.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.jcczdev.web.examplebeans.FakeDataSource;
import com.jcczdev.web.examplebeans.FakeJmsBroker;

/**
 * @author Juan Carlos - 2017/10/25
 *
 */
@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
	@PropertySource("classpath:datasource.properties"),
	@PropertySource("classpath:jms.properties")
})
public class PropertyConfig {
	
	@Autowired
	Environment env;
	
	@Value("${guru.username}")
	String user;
	@Value("${guru.password}")
	String pass;
	@Value("${guru.dburl}")
	String url;
	
	@Value("${guru.jms.username}")
	String jmsUsername;
	@Value("${guru.jms.password}")
	String jmsPassword;
	@Value("${guru.jms.url}")
	String jmsURL;
	
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(env.getProperty("USUARIO_SPRING")); //USUARIO_PRING is an OS system variable
		fakeDataSource.setPassword(pass);
		fakeDataSource.setUrl(url);		
		return fakeDataSource;
	}
	
	@Bean
	public FakeJmsBroker fakeJmsBroker() {
		FakeJmsBroker jmsBroker = new FakeJmsBroker();
		jmsBroker.setUsername(jmsUsername);
		jmsBroker.setPassword(jmsPassword);
		jmsBroker.setUrl(jmsURL);
		return jmsBroker;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
}
