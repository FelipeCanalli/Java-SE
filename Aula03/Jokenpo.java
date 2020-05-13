package exercicios;

/** 
   jokenp�
   @author Felipe Galv�o
*/

import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		int jogador = 0;
		int computador;
		Scanner leitor = new Scanner(System.in);

		System.out.println(" JOGO JOKENP�");
		System.out.println("1. PEDRA");
		System.out.println("2. PAPEL");
		System.out.println("3. TESOURA");
		System.out.print("Escolha sua m�o: ");
		jogador = (int) leitor.nextDouble();
		computador = (int) (Math.random() * 3 + 1);
		System.out.println("");
		switch (jogador) {
		case 1:
			System.out.print(" Usu�rio: PEDRA X ");
			break;
		case 2:
			System.out.print("Usu�rio: PAPEL X ");
			break;
		case 3:
			System.out.print("Usu�rio: TESOURA X ");
			break;
		default:
			jogador = 0;
			break;
		}

		if (jogador > 0) {
			switch (computador) {
			case 1:
				System.out.println("PEDRA ");
				break;
			case 2:
				System.out.println("PAPEL ");
				break;
			case 3:
				System.out.println("TESOURA ");
				break;
			}
		}

		if (jogador == computador) {
			System.out.println("Resultado: EMPATE");
		} else if (jogador == 2 && computador == 1 || jogador == 1 && computador == 3
				|| jogador == 3 && computador == 2) {
			System.out.println("Resultado: Usu�rio Ganhou");
		} else if (jogador == 0) {
			System.out.println("Usu�rio: Op��o inv�lida");
		} else {
			System.out.println("Resultado: Computador Ganhou");
		}
		leitor.close();
	}
}