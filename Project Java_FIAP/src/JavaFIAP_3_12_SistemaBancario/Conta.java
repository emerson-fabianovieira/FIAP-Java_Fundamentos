package JavaFIAP_3_12_SistemaBancario;

import java.io.Serializable;

/**
 * Sistema Bancário
 * @author emerson-fabianovieira
 * @version 1.0
 */

public class Conta implements Serializable {
	
	private int agencia;
	private int numero;
	private double saldo;
	public double depositar;
	public int setAgencia;
	public int setNumero;
	
	public Conta () {
		
	}

	/**
	 * Realiza um depósito na conta corrente
	 * @param agencia O número da agência
	 * @param numero O número da conta
	 * @param saldo O valor que será depositado
	 * @return O número do protocolo de confirmação
	 */
	public Conta (int agencia, int numero, double saldo) {
		
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Acrescenta valor ao Saldo da Conta
	 * @param valor que será depositado
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
	public double getSaldo () {
	return this.saldo;
	}


}
