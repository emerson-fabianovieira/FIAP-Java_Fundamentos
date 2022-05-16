package JavaFIAP_3_03_SistemaBancario;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta contaAgencia = new Conta ();
		Conta contaCorrente = new Conta ();
		Conta contaPoupanca = new Conta ();
		Conta contaInvestimento = new Conta ();
		
		contaCorrente.numero = 112022;
		contaAgencia.numero = 5012;
		contaCorrente.saldo = 20.5;
		contaCorrente.cliente.nome = "Emerson";
		contaCorrente.cliente.idade = 36;
		
		contaPoupanca.numero = 22;
		contaPoupanca.saldo = 30;
		contaPoupanca.cliente.nome = "Fulano";
		contaPoupanca.cliente.idade = 30;
		
		contaInvestimento.numero = 33;
		contaInvestimento.saldo = 40;
		contaInvestimento.cliente.nome = "Ciclano";
		contaInvestimento.cliente.idade = 50;
		
		System.out.println(" Nome do Cliente: " +contaCorrente.cliente.nome);
		System.out.println(" Idade do Cliente: " + contaCorrente.cliente.idade);
		System.out.println(" Agência: " + contaAgencia.numero);
		System.out.println(" Conta Corrente: " + contaCorrente.numero);
		System.out.println(" Saldo da C/C: " + contaCorrente.saldo);
		
		


	}

}
