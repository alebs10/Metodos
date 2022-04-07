package br.com.generation.exMetodos;

import java.util.Scanner;

public class Cliente {
/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
	
	String nome;
	String cpf;
	String endereco;
	String cidade;
	int idade;
	
	void imprimir (){
		System.out.println("Cliente: "+nome);
		System.out.println("CPF: "+cpf);
		System.out.println("Endereço: "+endereco);
		System.out.println("Cidade: "+cidade);
		System.out.println("Idade: "+idade);
	}
	void alterar() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Alterar o nome: ");
		nome = leia.next();
	}
}
