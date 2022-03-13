//Gerente � um funcionario e herda da Classe Funcionario e assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
		
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de notificacao do Gerente");
		return super.getSalario();
	}

	 @Override
     public void setSenha(int senha) {
         this.autenticador.setSenha(senha);
     }

     @Override
     public boolean autentica(int senha) {
     	
     	return this.autenticador.autentica(senha);
     }
	
}
