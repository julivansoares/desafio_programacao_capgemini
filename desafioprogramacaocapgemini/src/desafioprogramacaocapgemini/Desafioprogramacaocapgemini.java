/*
    Julivan Dos Santos Soares
 */
package desafioprogramacaocapgemini;
import java.util.Scanner;
/**
 *
 * @author hard
 */
public class Desafioprogramacaocapgemini {

    /**
     * @param args the command line arguments
    */
    
    public static void main(String[] args) {
        
         Scanner numero = new Scanner(System.in);// leitura do teclado 
         int b = numero.nextInt(); // convertendo entrada para inteiro
          
         for (int i = 1 ; i<= b ; i++) {   
                int j = b;
                for (int m=1; b>=m  ;m++) {
                    
                     if(j<=i){
                        System.out.print("*");
                     } else{
                         System.out.print(" ");
                     
                     }
                      j--;
                }
            
            }
        
    
    
}
}
