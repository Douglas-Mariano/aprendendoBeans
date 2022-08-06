package com.beans.aprendendoBeans;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Veiculo {
	
	private String modelo;
	private int ano;
	
	@Autowired
	MarcaVeiculo marcaVeiculo;
	
	
	public void exibir() {
		System.out.println(this.modelo + " - " + this.ano);
		marcaVeiculo.exibirMarca();
	}

}
