/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio120;

/**
 *
 * @author peluj
 */
public class E120 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            
            System.out.println(new Impar(24));
        } catch (ImparException e) {
            
            System.out.println(e.toString());
        }

        System.out.println("El programa a finalizado");
    }

}
