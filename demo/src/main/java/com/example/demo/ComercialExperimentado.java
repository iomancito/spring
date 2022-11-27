package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class ComercialExperimentado implements Empleados {
	
	private CreacionInformeFinanciero informe;
	private CreacionInformeBalance balance;
	

	
	public ComercialExperimentado(CreacionInformeFinanciero informe) {
		this.informe = informe;
	}
	@Autowired
	public ComercialExperimentado(CreacionInformeBalance balance) {
		this.balance = balance;
	}

	@Override
	public String getTareas() {
		return "Tarea del comercial";
	}

	@Override
	public String getInformes() {
		//return "Informe del comercial";
		//return informe.getInformeFinanciero();
		return balance.getInformeBalance();
	}

}
