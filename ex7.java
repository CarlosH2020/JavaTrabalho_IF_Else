/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Root
 */
import java.util.Scanner;
public class ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leitor = new Scanner(System.in);
        
        String nome,nome2;
        int id,id2;
        
        System.out.println("Digite seu nome: ");
        nome = leitor.next();
       
        System.out.println("Digite sua idade: ");
        id = leitor.nextInt();
        
        System.out.println("Digite nome de outra pessoa: ");
        nome2 = leitor.next();
       
        System.out.println("Digite a idade: ");
        id2 = leitor.nextInt();
        
        
        if (id > id2){
            
            System.out.printf("Apassoa mais velha é:%s coma a idade de %d anos",nome,id);
           
        }else{
            System.out.printf("Apassoa mais velha é:%s coma a idade de %d anos",nome2,id2);
        }
        
        
        
        
        
        
        
        
    }
    
}
