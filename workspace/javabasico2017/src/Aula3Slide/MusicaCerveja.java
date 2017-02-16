package Aula3Slide;

import java.util.Scanner;

public class MusicaCerveja {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o numero de cervejas:");
		int cerveja = leitor.nextInt();

		while (cerveja > 0) {
			System.out.println(cerveja + " Cervejas sobrando");
			System.out.println("Pegue uma garrafa");
			cerveja = cerveja - 1;
			System.out.println("Agora são " + cerveja + " Cervejas sobrando");
		}

		if (cerveja == 0) {
			System.out.println("Acabou a Cerveja");
			System.out.println("Quantas cervejas deseja adicionar?");
			cerveja = leitor.nextInt();
			System.out.println(cerveja + " Cervejas sobrando");
		}
		
		leitor.close();
	}
}
