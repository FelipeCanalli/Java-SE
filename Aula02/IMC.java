package exercicios;

/**
 * @author Felipe Galvão
 * Índice de Massa Corpórea
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		double peso, altura, imc;
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.0");
		// ENTRADA
		System.out.println("--- Calculadora de IMC ---");
		System.out.println("Digite sua altura: ");
		altura = leitor.nextDouble();
		System.out.println("Digite seu peso atual: ");
		peso = leitor.nextDouble();
		// PROCESSAMENTO
		if (altura > 3) {
			altura = altura / 100;
		}
		imc = peso / (altura * altura);
		// SAIDA
		System.out.println("Seu Indice de massa corporal é: " + formatador.format(imc));
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc > 18.5 && imc <= 24.9) {
			System.out.println("Peso Normal");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Sobrepeso");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Obesidade grau 1");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Obesidade grau 2");
		} else {
			System.out.println("Obesidade grau 3");
			leitor.close();
		}
	}
}
