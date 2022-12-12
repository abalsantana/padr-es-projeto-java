package factoryMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 O Factory Method define um método, que deve ser usado para criar objetos em vez da chamada direta ao construtor (operador new). 
 As subclasses podem substituir esse método para alterar a classe de objetos que serão criados.
 */

public class Teste {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("Tico", 4);

		cachorro.andar();

		Gato gato = new Gato();

		gato.comer();

		System.out.println("O cachorro " + cachorro.getNome() + ", tem a idade de " + cachorro.getIdade() + " anos.");

	}

}
