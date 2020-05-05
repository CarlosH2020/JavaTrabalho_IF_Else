
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
public class ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leitor = new Scanner(System.in);
        
        String aluno;
        String senha;
        String paswd = "aedb";
        
        System.out.println("Login: ");
        aluno = leitor.next();
        
        System.out.println("Senha: ");
        senha = leitor.next();
        
        if(senha == paswd){
            
            System.out.println("User correto seja bem vindo(a):");
        }else{
            
            System.out.println("User incorreto tente outra vez.");
        
        }
        
        
        
        
        
    }
    
}
