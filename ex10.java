
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
public class ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        
   String nome, sexo, M, F, resp;
   float altura;
   float pesoH;
   float pesoM;
do{
    System.out.printf("\n\t=================================================");
    System.out.printf("\n\t\"Programa que calcula o peso ideal para uma pessoa\"\n");
    System.out.printf("\n\t Digite o nome da pessoa:....");
    nome = leitor.next();
    System.out.printf("\t Digite o sexo: M/F:..");	
    sexo = leitor.next();
    System.out.printf("\t Digite a altura:.....");
    altura = leitor.nextFloat();

       //  fazer a formula do peso ideal


    pesoH = (float) ((72.7 * altura)-58);
    pesoM = (float) ((62.1 * altura)-44.7);

       //  ver se é homem ou mulher
       
        if( sexo == "M"){
          System.out.printf("\t O peso ideal do   %s e' ..........", nome);
                        }
            else if( sexo == "F"){
              System.out.printf("\t O peso ideal da   %s e' ...........", nome);
         }

            System.out.printf("\n\t proximo: (s/n).............");
            resp = leitor.next();
            }while(resp.equals ("s"));
            System.out.printf("\t finalizando......");
            System.out.printf("\n\t=================================================");
            System.out.printf(" \n ");
  }
    
    
    
    
    
  }
         
         
         
         
        
        
        
        
    
    
