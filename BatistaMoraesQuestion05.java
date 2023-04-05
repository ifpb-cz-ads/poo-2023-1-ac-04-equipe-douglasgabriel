import java.util.Scanner;
public class BatistaMoraesQuestion05{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero de 1 a 7:");
		int diaSemana = scan.nextInt();
		switch(diaSemana){
			case 1: 
				System.out.println("O dia da semana eh Domingo");
				break;
			case 2:
				System.out.println("O dia da semana eh Segunda-feira");
				break;
			case 3:
				System.out.println("O dia da semana eh Terca-feira");
				break;
			case 4:
				System.out.println("O dia da semana eh Quarta-feira");
				break;
			case 5:
				System.out.println("O dia da semana eh Quinta-feira");
				break;
			case 6:
				System.out.println("O dia da semana eh Sexta-feira");
				break;
			case 7:
				System.out.println("O dia da semana eh Sabado");
				break;
		}
	}
}
