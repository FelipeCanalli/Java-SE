package fundamentos;

/** 
  Sorteio de N�meros
  @author Felipe Galv�o
*/

public class Sorteio {

	public static void main(String[] args) {
		int sorteio;
//		Resultados poss�veis :	1 2 3
// 		Depois do asterisco s�o os n�meros que ele pode sortear
		sorteio = (int) (Math.random() * 3 + 1);
		System.out.println("Resultado: " + sorteio);
	}

}
