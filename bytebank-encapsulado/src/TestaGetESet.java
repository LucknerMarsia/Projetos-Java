
public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo n�o compila porque titular � privado
		paulo.setNome("paulo silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		//outra forma de fazer esta mesma altera��o
		
		Cliente TitularDaConta = conta.getTitular();
		TitularDaConta.setProfissao("Programador");
		
		System.out.println(TitularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
	}
}
