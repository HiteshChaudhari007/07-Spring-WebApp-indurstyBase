package com.config;

import java.util.Properties;

import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.model.Student;

@Configuration
@ComponentScan(basePackages = "com")
public class appConfig {
	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Bean
	public DriverManagerDataSource ds() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/school");
		ds.setUsername("root");
		ds.setPassword("root");

		return ds;
	}

	@Bean
	public LocalSessionFactoryBean factoryBean() {
		LocalSessionFactoryBean lb = new LocalSessionFactoryBean();
		lb.setDataSource(ds());

		Properties setting = new Properties();
		setting.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		setting.put(Environment.HBM2DDL_AUTO, "update");
		setting.put(Environment.SHOW_SQL, "true");

		lb.setHibernateProperties(setting);
		lb.setAnnotatedClasses(Student.class);
		return lb;

	}

}
