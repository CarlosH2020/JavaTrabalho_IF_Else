import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		int num1;
		int num2;
		int soma;
		
		System.out.println("digite 1ºnumero:");
		num1 = leitor.nextInt();
		
		System.out.println("digite 2ºnumero:");
		num2 = leitor.nextInt();
		
		
		soma = (num1 + num2);
		
		
		if (soma > 10 ) {
			System.out.printf("O numero é:\n"+ soma);
		}
		

	}

}
