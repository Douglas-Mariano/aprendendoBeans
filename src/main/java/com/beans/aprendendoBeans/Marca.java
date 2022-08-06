package com.beans.aprendendoBeans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Marca implements MarcaVeiculo {
	
	private String marca;
	
	public void exibirMarca() {
		System.out.println(this.marca);
	}

}
