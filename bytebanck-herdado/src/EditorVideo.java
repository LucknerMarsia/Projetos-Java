//Gerente é um funcionario e herda da Classe Funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {	
		System.out.println("Estamos chamando o metodo de bonificacao do EDITORVIDEO");
		return 150;
	}
	
}
