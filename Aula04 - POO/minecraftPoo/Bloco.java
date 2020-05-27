package minecraftPoo;

/**
 * Poo - Minecraft
 * 
 * @author Felipe Galvão
 */

public class Bloco {
	
	int resistencia;
	String textura;
	
	void construir() {
		System.out.println("Bloco colocado");
	}

	void minerar() {
		System.out.println("Recursos obtidos");
	}
	
	void craftar() {
		System.out.println("Objeto Construído");
	}
}
