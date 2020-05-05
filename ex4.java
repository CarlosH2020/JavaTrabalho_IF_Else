import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("Número de valores ? ");
		int n = in.nextInt ();
		int[] array = new int [6];

		int m =  array.length;

		for (int i = m-2; i >= 0; i--)
		    if (array[i] > array[n-1]) System.out.print(array[i] + ",");
		    	
		    }
		    
		     
		 
		  
		
	

	}




