package exercicios;

import java.lang.Thread;
import java.util.Scanner;

/**
 * Sorteio de Números
 * 
 * @author Felipe Galvão
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
		System.out.println(" Você, Marcos e João querem jogar purrinha");
		Thread.sleep(1000);
		System.out.println(" *Todos recebem 3 feijões");
		Thread.sleep(2000);
		System.out.println("");
		System.out.println(" Quantos feijões você quer pegar essa rodada ?");
		jogador = (int) leitor.nextDouble();
		if (jogador > 3) {
			System.out.println(" Você só pode pegar até 3 feijões");
		}
		System.out.println(" Quantos feijões você acha que vai ter no total na mesa ?");
		soma = (int) leitor.nextDouble();

		mao2 = (int) (Math.random() * 4);
		mao3 = (int) (Math.random() * 4);
		resultado = (jogador + mao2 + mao3);

		System.out.print(" *Marcos colocou " + mao2);
		System.out.println(" e João " + mao3);
		System.out.println("");
		if (soma == resultado) {
			System.out.println(" Você ganhou essa rodada");
		} else {
			System.out.println(" Você não ganhou essa rodada");
		}
		leitor.close();
	}
}