package JavaFIAP_3_07_SistemaBancario;

/**
 * Sistema Banc�rio
 * @author emerson-fabianovieira
 * @version 1.0
 */

public class Conta {
	
	int agencia;
	int numero;
	double saldo;
	
	public Conta () {
		
	}

	/**
	 * Realiza um dep�sito na conta corrente
	 * @param agencia O n�mero da ag�ncia
	 * @param numero O n�mero da conta
	 * @param saldo O valor que ser� depositado
	 * @return O n�mero do protocolo de confirma��o
	 */
	public Conta (int agencia, int numero, double saldo) {
		
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	/**
	 * Acrescenta valor ao Saldo da Conta
	 * @param valor que ser� depositado
	 */
	public void depositar (double valor) {	
		this.saldo += valor;
	}
	
	/**
	 * Retira um valor do Saldo da Conta
	 * @param valor
	 * @see depositar
	 */
	public void retirar (double valor) {	
	this.saldo -= valor;
	}
	

	/**
	 * Verifica o Saldo da Conta
	 * @return Valor do Saldo da Conta
	 */
	public double veirficarSaldo () {
	return this.saldo;
	}


}
