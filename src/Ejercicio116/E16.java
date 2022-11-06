/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio116;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author peluj
 */
public class E16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        int numerador = 0;
        int denominador = 0;
        double division = 0;
        
        System.out.println("Introduce un numerador y un denominador");
        do {
            try {
                numerador = scan.nextInt();
                denominador = scan.nextInt();
                if (numerador > 100 && denominador < 0) {
                    throw new RuntimeException("El numerador tiene que ser menor a 100 y el denominador mayor  0");
                }

                division =  numerador / denominador;
                salir = true;
            }catch (ArithmeticException e) {
                System.out.println("Error no se puede hacer una division entre 0");
            }catch(InputMismatchException e){
                System.out.println("El valor introducido no es correcto");
                scan.nextLine();
            }

        } while (!salir);
        System.out.println(division);
    }

}
