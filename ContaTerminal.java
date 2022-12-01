package estudandonovo;

import java.util.Scanner;

public class ContaTerminal {
	
	
		public static void main(String[] args) {
			// TODO "Conhecer e importar a classe scanner
					// "Exibir as mensagens para o nosso usuario
					//obter pelo scanner os valores digitados no terminal
					//Exibir a mensagem da conta criada
				Scanner scanner = new Scanner (System.in);
				System.out.println("Digite seu nome e sua conta corrente");
				String nome = scanner.next();
				int contaCorrente = scanner.nextIntJo();
				System.out.println("Seja bem-vindo" + nome + "!"+ " Sua conta corrente é" + contaCorrente);
				
			
			}
			
			

		}

	


