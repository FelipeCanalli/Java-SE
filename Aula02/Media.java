package exercicios;

/** 
  C�lculo de M�dias
  @author Felipe Galv�o
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// ctrl + shift + f (alinhamento de codigo)
		double nota1, nota2, media;
		// objeto leitor (usado para capturar dados)
		Scanner leitor = new Scanner(System.in);
		// cria��o de objeto com base na classe scanner
		// entrada ; ctrl + space completa o sysout
		// objeto formatador (usado para formatar o resultado)
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.println("C�culo da m�dia");
		System.out.print("Digite a nota 1 : ");
		nota1 = leitor.nextDouble();
		System.out.print("Digite a nota 2 : ");
		nota2 = leitor.nextDouble();
		// processamento
		media = (nota1 + nota2) / 2;
		System.out.println("M�dia : " + formatador.format(media));
		if (media < 2) {
			System.out.println("REPROVADO");
		} else if (media >= 2 && media < 5) {
			System.out.println("RECUPERA��O");
		} else {
			System.out.println("APROVADO");
		}
		leitor.close();
	}
}
