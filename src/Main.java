
public class Main {

	public static void main(String[] args) {
		Cliente rodrigo = new Cliente();
		rodrigo.setNome("Rodrigo");

		Conta cc = new ContaCorrente(rodrigo);
		Conta poupanca = new ContaPoupanca(rodrigo);
		
		Cliente yanninha = new Cliente();
		yanninha.setNome("Yanna Cristina");
		
		Conta cc2 = new ContaCorrente(yanninha);
		Conta poupanca2 = new ContaPoupanca(yanninha);

		cc.depositar(500);
		cc.transferir(100, poupanca);
		poupanca.sacar(60);

		cc2.depositar(1000);
		cc2.transferir(200, poupanca);
		poupanca2.depositar(350);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();
	}

}
