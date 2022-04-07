package br.com.generation.exMetodos;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] agrs) {
	 
		Cliente objetoCliente = new Cliente();
		
		objetoCliente.nome = "Alexandre";
		objetoCliente.cpf = "1234567910";
		objetoCliente.endereco = "Jardim Paulista";
		objetoCliente.cidade = "São Paulo";
		objetoCliente.idade = 20;
		
		objetoCliente.imprimir();
		
		objetoCliente.alterar();
		objetoCliente.imprimir();
	 
	}
}
