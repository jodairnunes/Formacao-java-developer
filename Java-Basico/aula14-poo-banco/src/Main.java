
public class Main {

	public static void main(String[] args) {
		Cliente arthur = new Cliente();
		arthur.setNome("Arthur Nunes");
		Cliente joao = new Cliente();
		joao.setNome("João da Silva");
		
		Conta poupancaArthur = new ContaPoupanca(arthur);
		Conta ccArthur = new ContaCorrente(arthur);
		poupancaArthur.despositar(200);
		poupancaArthur.transferir(150, ccArthur);
		poupancaArthur.impirmirSaldo();
		ccArthur.impirmirSaldo();
		
		Conta poupancaJoao = new ContaPoupanca(joao);
		Conta ccJoao = new ContaCorrente(joao);
		poupancaJoao.despositar(130);
		ccJoao.despositar(50);
		poupancaJoao.transferir(30, ccJoao);
		poupancaJoao.impirmirSaldo();
		ccJoao.impirmirSaldo();

  	}

}
