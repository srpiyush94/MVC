package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.demo.Vehicle;

@SuppressWarnings("deprecation")
public class BeanTest {

	public static void main(String[] args) {

		Resource resource=new ClassPathResource("beans.xml");
		BeanFactory bf=new XmlBeanFactory(resource);
		Vehicle t=(Vehicle)bf.getBean("car");
		t.move();
		

	}

}
