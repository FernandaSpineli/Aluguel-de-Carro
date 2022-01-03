package com.algaworks.exemplos;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import com.algaworks.Cliente;

public class CadastroCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Ana Borges", LocalDate.of(1988, Month.MARCH, 15));
		
		int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();
		
		if(idade >= 18) {
			System.out.printf("Pode ser cadastrado. Sua idade é: %d.", idade);
		} else {
			System.err.printf("Sua idade é: %d. Não pode ter carteira.", idade);
		}
		
		
		
	}
}
