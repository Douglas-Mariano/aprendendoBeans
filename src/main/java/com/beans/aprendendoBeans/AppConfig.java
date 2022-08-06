package com.beans.aprendendoBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Veiculo getVeiculo() {
		return new Veiculo();
	}
	
	public MarcaVeiculo getMarcaVeiculo() {
		return new Marca();
	}

}
