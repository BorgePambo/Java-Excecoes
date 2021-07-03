package javaapp12;

import java.util.Scanner;


public class JavaApp12 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] nome = {"Borge", "Bastos", "Pambo"};
        
        try{
            for(int i=0; i < nome.length; i++){
                i = sc.nextInt();
                System.out.println(nome[i]);
            }
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Indice inexistente no vetor" + e.getMessage());
        }
        
        sc.close();
    }
    
}
