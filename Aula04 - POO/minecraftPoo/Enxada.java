package minecraftPoo;

/**
 * Poo - Minecraft
 * 
 * @author Felipe Galvão
 */

public class Enxada extends Bloco{

	int dano;
	
	void arar() {
		System.out.println("Sementes plantadas");
	}
	
	//polimorfismo
	void minerar() {
		System.out.println("Dano causado");
	}
	
}