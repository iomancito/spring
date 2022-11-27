package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class InformeBalance implements CreacionInformeBalance{
	@Override
	public String getInformeBalance() {
		return "Informe balance";
	}


}
