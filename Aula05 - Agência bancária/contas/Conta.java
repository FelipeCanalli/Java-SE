package contas;

public class Conta {
	// atributos
	public String cliente;
	public double saldo;

	//construtor
	public Conta(){
		System.out.println("Ag�ncia 0267");
	}
	
	// m�todo sem retorno "void"
	public void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
	
	// m�todo sem retorno com par�metro (dados = v�riaves)
	void sacar(double valor) {
		saldo -= valor;	// saldo = saldo - valor
		System.out.println("D�bito: " + valor);
	}
	
	// m�todo sem retorno com par�metro (dados = v�riaves)
	void depositar(double valor) {
		saldo += valor;	// saldo = saldo - valor
		System.out.println("Cr�dito: " + valor);
	}
	
	// m�todo sem retorno com objeto
	// Conta -> classe modelo
	// destino � o objeto
	void tranferir(Conta destino, double valor) {
		this.sacar(valor);         //1� voc� debita da sua conta
		destino.depositar(valor);  //2� voc� transfere
		System.out.println("Tranfer�ncia: " +valor);
	}
	
	//m�todo com retorno
	double soma(double conta1, double conta2) {
		double total = conta1 + conta2;
		return total;	
	}
	
}
	
	