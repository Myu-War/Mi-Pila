/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stackadt;

import java.util.Scanner;

/**
 *
 * @author introduccion02
 */
public class Playground {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        miPila miPila = new miPila();
        Scanner scannerLector = new Scanner(System.in);
        char charLector;
        String stringEntrante, veredicto="Todo bien. ☺";
        StringBuilder evaluadorPalindromo = new StringBuilder();
        
        System.out.print("Ingresa un String para ser evaluado.\n");
        stringEntrante=scannerLector.nextLine();
        for(int i=0;i<stringEntrante.length();i++){
            charLector=stringEntrante.charAt(i);
            if(charLector=='('){
                miPila.push(charLector);
            }
            else if(charLector==')'){
                if(miPila.isEmpty()){
                    veredicto="Tiene parentesis mal puestos. ▓▓▒▒▒▓▓";
                }
                else{
                miPila.pop();
                }
            }
        }
        if(!miPila.isEmpty()){
            veredicto="Tiene parentesis mal puestos. ▓▓▒▒▒▓▓";
        }
        System.out.print("\n"+veredicto);
        
        System.out.print("\nIngresa un String para ser evaluado.\n");
        stringEntrante=scannerLector.nextLine();
        stringEntrante=stringEntrante.replaceAll(" ", "");
         for(int i=0;i<stringEntrante.length();i++){
             charLector=stringEntrante.charAt(i);
             miPila.push(charLector);
         }
         for(int i=0;i<stringEntrante.length();i++){
             evaluadorPalindromo.append(miPila.peek());
             miPila.pop();
         }
         if(evaluadorPalindromo.toString().equals(stringEntrante.toString())){
              System.out.print("\nEs un palindromo‼ ☻☺☻☺☻\n");
         }
         else{
              System.out.print("\nNo tienes un palindromo ▓▓▒▒▒▓▓\n");
         }
    }
}
