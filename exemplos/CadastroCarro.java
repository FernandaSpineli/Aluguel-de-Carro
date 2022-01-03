package com.algaworks.exemplos;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.algaworks.Carro;

public class CadastroCarro {

	public static void main(String[] args) {
		
		Carro gol = new Carro("Gol", 90.0, Year.of(2012));
		Carro cruze = new Carro("Cruze", 200.0, Year.parse("2021"));
		Carro civic = new Carro("Civic", 129.0, Year.of(2015));
		
		List<Carro> carros = Arrays.asList(gol, cruze, civic);
		
		carros.stream()
		  .filter(c -> c.getAnoFabricacao().isAfter(Year.of(2012)))
			.forEach(c -> System.out.println(c.getModelo()));
		
		
		
	}
}
