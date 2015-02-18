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
        miPila s = new miPila();
        Scanner lec = new Scanner(System.in);
        char ent;
        String ent2, evaluacion="Todo bien. ☺";
        StringBuilder cad = new StringBuilder();
        StringBuilder cad2 = new StringBuilder();
        
        System.out.print("Ingresa un String para ser evaluado.\n");
        ent2=lec.nextLine();
        for(int i=0;i<ent2.length();i++){
            ent=ent2.charAt(i);
            if(ent=='('){
                s.push(ent);
            }
            else if(ent==')'){
                if(s.isEmpty()){
                    evaluacion="Tiene parentesis mal puestos. ▓▓▒▒▒▓▓";
                }
                else{
                s.pop();
                }
            }
        }
        if(!s.isEmpty()){
            evaluacion="Tiene parentesis mal puestos. ▓▓▒▒▒▓▓";
        }
        System.out.print("\n"+evaluacion);
        
        System.out.print("\nIngresa un String para ser evaluado.\n");
        ent2=lec.nextLine();
         for(int i=0;i<ent2.length();i++){
             ent=ent2.charAt(i);
             if(ent!=' '){
                cad2.append(ent);
             }
             s.push(ent);
         }
         for(int i=0;i<ent2.length();i++){
             if(!s.peek().equals(' ')){
                cad.append(s.peek());
             }
             s.pop();
         }
         if(cad2.toString().equals(cad.toString())){
              System.out.print("\nEs un palindromo‼ ☻☺☻☺☻\n");
         }
         else{
              System.out.print("\nNo tienes un palindromo ▓▓▒▒▒▓▓\n");
         }
    }
}
