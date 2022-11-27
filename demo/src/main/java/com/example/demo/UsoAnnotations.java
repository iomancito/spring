package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("aplicationContext.xml");
		
		Empleados Antonio = contexto.getBean("comercialExperimentado", Empleados.class);
		
		System.out.println(Antonio.getInformes());
		System.out.println(Antonio.getTareas());
		
		contexto.close();
		
	}

}
