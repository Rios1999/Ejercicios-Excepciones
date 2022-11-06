/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio122;

/**
 *
 * @author peluj
 */
public class testGato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Gato jaime = new Gato("pep", 4);
           
            try {
                jaime.setNombre("Juan de dios");

            } catch (GatoException e) {
                System.out.println(e.toString());

            }

            try {
                
                jaime.setEdad(-2);
               
            } catch (GatoException e) {
                System.out.println(e.toString());

            }
            
            try{
                Gato juan = new Gato("oeo5373", -2);
            }catch(GatoException e){
                System.out.println(e.toString());
            }
        } catch (GatoException e) {
            System.out.println(e.toString());
        }

    }

}
