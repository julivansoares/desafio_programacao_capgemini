/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafioprogramacaocapgemini;

import java.util.Scanner;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author hard
 */
public class DesafioProgramacaoCapgeminiSegundaAtividade {
     
    public static void main(String[] args) {
      Scanner senha = new Scanner(System.in);
         String tamanho = senha.next();
         String tamanho1=tamanho;
         String tamanho2=tamanho;
         String tamanho3=tamanho;
         
       Pattern p = Pattern.compile("\\d");
       Pattern c = Pattern.compile("[a-z]");
       Pattern T = Pattern.compile("[A-Z]");
       Pattern e = Pattern.compile("[!@#$%^&*()-+]");
       Matcher temDigito= p.matcher(tamanho);
       Matcher temMinuscula = c.matcher(tamanho1);
       Matcher temMauscula= T.matcher(tamanho2);
       Matcher temEspecial = e.matcher(tamanho3);
       int cont=0;
       
       if(tamanho.length()>=6){  
              cont++;
       } 
       if(temDigito.find()){
            cont++;
       }
       if(temMinuscula.find()){
             cont++;
        }
        if(temMauscula.find()){
             cont++;
        }
        if(temEspecial.find()){
             cont++;
        }
        if(tamanho.length()>=6){
           cont=cont+1;

           System.out.print(cont); 
         }
        else{
          int falta=  cont;
          int total=6-falta;
          
          System.out.print(total+"\n"); 


          
         }
   

}
    
}

