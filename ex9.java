
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
public class ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leitor = new Scanner(System.in);
        int p1 = 30;
        int p2 = 45;
        float porc;
        float venda = (float) 20;
        float n1;
        float soma;
        
        System.out.printf("Digite o valor: ");
        n1 = leitor.nextFloat();
        
        
        if (n1 > venda){
            
            soma = p2*n1/100;
            
             System.out.printf("lucro é de %.2f" ,soma);
        
        }else{
            soma = p1*n1/100;
             System.out.printf("lucro é de %.2f" ,soma);
        
        }
        
        
    
    
    
        
        
        
    
    }
    
}
