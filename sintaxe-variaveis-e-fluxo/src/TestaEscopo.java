
public class TestaEscopo {
	
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais.");
				
				int idade = 20;
				int quantidadePessoas = 3;
				
				boolean acompanhado;
				
				if(quantidadePessoas >= 2) {
					acompanhado = true;
				} else {
					acompanhado = false;
				}
				
				if (idade >= 18 && acompanhado) {
					System.out.println("Seja bem vindo!");
				} else {
						
						System.out.println("Infelizmente voc� na� pode entrar");
			
				}
			}


}
