package br.com.generation.exMetodos;
/*Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
public class Aviao {

	String marca;
	String modelo;
	int ano;
	int velocidade;
	
	void imprimir() {
		System.out.println("Modelo: "+modelo);
		System.out.println("Avi�o: "+marca);
		System.out.println("Ano: "+ano);
	}
	
	void decolar(int aceleracao) {
		velocidade+=aceleracao;
	}
	void diminuirVel(int reduzir) {
		velocidade = velocidade-reduzir;
	}
}
