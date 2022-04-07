package br.com.generation.exMetodos;
/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
public class Aviao {

	String marca;
	String modelo;
	int ano;
	int velocidade;
	
	void imprimir() {
		System.out.println("Modelo: "+modelo);
		System.out.println("Avião: "+marca);
		System.out.println("Ano: "+ano);
	}
	
	void decolar(int aceleracao) {
		velocidade+=aceleracao;
	}
	void diminuirVel(int reduzir) {
		velocidade = velocidade-reduzir;
	}
}
