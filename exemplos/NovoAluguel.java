package com.algaworks.exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;

import com.algaworks.Aluguel;
import com.algaworks.Carro;
import com.algaworks.Cliente;

public class NovoAluguel {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Ana Borges", LocalDate.of(1988, Month.MARCH, 15));
		Carro civic = new Carro("Civic", 129.0, Year.of(2015));
		
		LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(), 
				LocalTime.of(LocalTime.now().getHour(), 0));
		LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);
		
		Aluguel aluguel = new Aluguel(cliente, civic, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);

		imprimirRecibo(aluguel);
	}

	private static void imprimirRecibo(Aluguel aluguel) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>> RECIBO <<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("Carro: " + aluguel.getCarro().getModelo());
		System.out.println("Cliente: " + aluguel.getCliente().getNome());

		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("Data e hora da retirada: " + aluguel.getDataEHoraDaRetirada().format(formater));
		System.out.println("Data e hora prevista para devolução: " + aluguel.getDataEHoraPrevistaParaDevolucao().format(formater));
	}

}
