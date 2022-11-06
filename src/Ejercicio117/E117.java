/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio117;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author peluj
 */
public class E117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        int contador = 0;
        int numero = 0;
        int gen = (int) Math.floor(Math.random()*(101-1)+1);
        
        do{
            
        
            try{
                System.out.println("Introduce un numero");
                numero = scan.nextInt();
                if(numero > gen){
                    System.out.println("El numero es mayor al indicado");
                }else{
                    System.out.println("El numero es menor al indicado");
                }
            
                if(numero == gen){
                    salir = true;
                    System.out.println("Enhorabuena as acertado!!!");
                }
                contador++;
            }catch(InputMismatchException e){
               System.out.println("Error dato incorrecto");
               scan.next();
            }
        }while(!salir);
        
        System.out.println("Intentos "+contador);
    }
    
}
