package com.algaworks.exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

import com.algaworks.Aluguel;
import com.algaworks.Carro;
import com.algaworks.Cliente;

public class DevolucaoCarro {

	public static void main(String[] args) {
		Aluguel aluguel = recuperarAluguel();
		
		// PARA CADA HORA DE ATRASO DEVE PAGAR 10% DO VALOR DO CARRO EM MULTA
		LocalDateTime dataEHoraRealDaDevolucao = LocalDateTime.of(LocalDate.now().plusDays(5), LocalTime.now());
		aluguel.setDataEHoraRealDaDevolucao(dataEHoraRealDaDevolucao);
		aluguel.imprimirFatura();
	}
	
	private static Aluguel recuperarAluguel() {
		Cliente cliente = new Cliente("Ana Borges", LocalDate.of(1988, Month.MARCH, 15));
		Carro civic = new Carro("Civic", 129.0, Year.of(2015));

		LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(), 
				LocalTime.of(LocalTime.now().getHour(), 0));
		LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);
		
		Aluguel aluguel = new Aluguel(cliente, civic, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
		return aluguel;
	}
}
