package fundamentos;

/** 
  Sorteio de Números
  @author Felipe Galvão
*/

public class Sorteio {

	public static void main(String[] args) {
		int sorteio;
//		Resultados possíveis :	1 2 3
// 		Depois do asterisco são os números que ele pode sortear
		sorteio = (int) (Math.random() * 3 + 1);
		System.out.println("Resultado: " + sorteio);
	}

}
