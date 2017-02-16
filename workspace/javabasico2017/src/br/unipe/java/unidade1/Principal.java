package br.unipe.java.unidade1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		Cachorro pitbull = new Cachorro();

		System.out.println("Informe o nome do cachorro:");
		pitbull.nome = leitor.nextLine();
		pitbull.late();

		Carro ferrarri = new Carro();
		ferrarri.retroceder();
		ferrarri.avancar();

		Carro fusca = new Carro();
		fusca.abastecer();
		fusca.parar();
		
		leitor.close();
	}

}
