
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Root
 */
public class ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        
        
        int num;
        
        System.out.println("Digite um número: ");
        num = leitor.nextInt();
        
        if (num %2 == 0){
            
            System.out.println("Número digitado é PAR:");
            
            
        }else{
            
            System.out.println("Número digitado é IMPAR");
        }
        
        
        
    }
    
}
