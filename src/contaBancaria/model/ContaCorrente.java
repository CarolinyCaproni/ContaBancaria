package contaBancaria.model;

public class ContaCorrente extends Conta { // extends => herança/herda
	// Atributos / Variaveis
	private float limite;

	/*
	 * 3 Modificadores de Acesso
	 * 
	 * Private Protected Public Default (Padrão na documentação)
	 */

	// Método Especial - Método Construtor
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {

		// this => Classe Conta (Conta.numero = Atributo)
		// super => Invocando o Método Construtor de Conta
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}
	
	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = 5000.0f;
	}
	
	// Métodos de Acesso
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	// Polimorfismo de Sobrescrita
	public boolean sacar(float valor) {
		
		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	// Polimorfismo de Sobrescrita => adiciona mais logica a um método já existente
	// Tem que ter o mesmo nome e chamar com o super
	public void visualizar() {
		super.visualizar();
		System.out.println("                 Limite de Crédito: " + this.limite);
	}
	
}
