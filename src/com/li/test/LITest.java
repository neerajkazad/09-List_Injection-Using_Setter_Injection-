package com.li.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.li.beans.Course;

public class LITest {
	public static void main(String[] args) {
		Course course = new Course();
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/li/common/application-context.xml"));
		course = factory.getBean("bTechCS",Course.class);
		System.out.println(course);
	}
}
