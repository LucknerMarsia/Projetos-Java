//Gerente é um funcionario e herda da Classe Funcionario
public class Designer extends Funcionario {
	
		public double getBonificacao() {
			
			System.out.println("Chamando o metodo de bonificacao do Designer.");
			return 200;
	}
	
}
