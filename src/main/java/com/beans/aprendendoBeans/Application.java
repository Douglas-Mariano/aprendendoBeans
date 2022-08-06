package com.beans.aprendendoBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Veiculo veiculo = factory.getBean(Veiculo.class);
		veiculo.setModelo("Palio");
		veiculo.setAno(2010);
		
		Marca marca = factory.getBean(Marca.class);
		marca.setMarca("Fiat");
		
		veiculo.exibir();
		
		((AbstractApplicationContext) factory).close();

	}

}
