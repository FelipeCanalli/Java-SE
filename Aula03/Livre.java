package exercicios;

import java.lang.Thread;
import java.util.Scanner;

/**
 * Sorteio de N�meros
 * 
 * @author Felipe Galv�o
 */

public class Livre {

	public static void main(String[] args) throws InterruptedException {
		Scanner leitor = new Scanner(System.in);
		int jogador;
		int soma;
		int resultado;
		int mao2 = 0;
		int mao3 = 0;
		System.out.println("	PURRINHA");
		Thread.sleep(1000);
		System.out.println(" Voc�, Marcos e Jo�o querem jogar purrinha");
		Thread.sleep(1000);
		System.out.println(" *Todos recebem 3 feij�es");
		Thread.sleep(2000);
		System.out.println("");
		System.out.println(" Quantos feij�es voc� quer pegar essa rodada ?");
		jogador = (int) leitor.nextDouble();
		if (jogador > 3) {
			System.out.println(" Voc� s� pode pegar at� 3 feij�es");
		}
		System.out.println(" Quantos feij�es voc� acha que vai ter no total na mesa ?");
		soma = (int) leitor.nextDouble();

		mao2 = (int) (Math.random() * 4);
		mao3 = (int) (Math.random() * 4);
		resultado = (jogador + mao2 + mao3);

		System.out.print(" *Marcos colocou " + mao2);
		System.out.println(" e Jo�o " + mao3);
		System.out.println("");
		if (soma == resultado) {
			System.out.println(" Voc� ganhou essa rodada");
		} else {
			System.out.println(" Voc� n�o ganhou essa rodada");
		}
		leitor.close();
	}
}