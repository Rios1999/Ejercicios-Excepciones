/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio113;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author peluj
 */
public class E113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cadena = " ";
        int N = 0;
        boolean salir = true;
                
            cadena = "hola como estas";
        do{
            try{
                
                System.out.println("Introduce una numero");
                N = scan.nextInt();
             
                
                while((N<0)||(N>cadena.length())){
                    System.out.println("mete numero entre 0 y "+cadena.length() );
                    N = scan.nextInt();
                }
                
                
                salir = false;
            }catch(InputMismatchException e){
                System.out.println("Error El valor no a sido el indicado "+e.getMessage());
                scan.next();
                
            }/*catch(IndexOutOfBoundsException e){
                System.out.println("No existe la posición N en la cadena");
                N = cadena.length()-1;
            }*/
        }while(salir);
        
        System.out.println(cadena.charAt(N));
        
        
        
        
        
        
    }
    
}
