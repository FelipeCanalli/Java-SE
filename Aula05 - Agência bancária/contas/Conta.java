package contas;

public class Conta {
	// atributos
	public String cliente;
	public double saldo;

	//construtor
	public Conta(){
		System.out.println("Agência 0267");
	}
	
	// método sem retorno "void"
	public void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
	
	// método sem retorno com parâmetro (dados = váriaves)
	void sacar(double valor) {
		saldo -= valor;	// saldo = saldo - valor
		System.out.println("Débito: " + valor);
	}
	
	// método sem retorno com parâmetro (dados = váriaves)
	void depositar(double valor) {
		saldo += valor;	// saldo = saldo - valor
		System.out.println("Crédito: " + valor);
	}
	
	// método sem retorno com objeto
	// Conta -> classe modelo
	// destino é o objeto
	void tranferir(Conta destino, double valor) {
		this.sacar(valor);         //1º você debita da sua conta
		destino.depositar(valor);  //2º você transfere
		System.out.println("Tranferência: " +valor);
	}
	
	//método com retorno
	double soma(double conta1, double conta2) {
		double total = conta1 + conta2;
		return total;	
	}
	
}
	
	