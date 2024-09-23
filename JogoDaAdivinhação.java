import java.util.Random;
import java.util.Scanner;
public class JogoDaAdivinhação {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;
		
		do {
			System.out.println("Ao digitar um número, insira 0 ... 100\n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			
			System.out.println("Comece o Jogo! Boa Sorte");
			tentativas = 0;
			
		do {
				tentativas++;
				System.out.printf("tentativa %d:", tentativas);
				numero = entrada.nextInt();
				
				if(numero > numeroSorteado) {
					System.out.printf("Esse numero é menor que  %d... \n\n", numero);
				} else if (numero < numeroSorteado) {
					System.out.printf("Esse numero é maior que  %d \n\n", numero);
				} else {
					System.out.printf("\n\n Voce acertou o numero! %d tentativas\n\n", tentativas);
				}
				
		}while (numero != numeroSorteado);
				System.out.println("Enter 0 para sair ou qualquer outro número para continuar: ");
				continuar = entrada.nextInt();
				
		}while (continuar != 0);
		entrada.close();
		
	}
}