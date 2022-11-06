/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio122;

/**
 *
 * @author peluj
 */
public class Gato{

    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws GatoException{
        comprobacionNombre(nombre);
        comprobacionEdad(edad);
        this.nombre = nombre;
        this.edad = edad;
    }

    private void comprobacionNombre(String nombre) throws GatoException {
        if(nombre.length() > 3) {
            throw new GatoException("Error El nombre debe contener unicamente 3 Caracteres");
        }
    }
    
    private void comprobacionEdad(int edad) throws GatoException {
        if(edad < 0) {
           throw new GatoException("Error la edad no puede ser menor de 0");
        }
    }

    public void setNombre(String nombre) throws GatoException {
        comprobacionNombre(nombre);
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws GatoException {
        comprobacionEdad(edad);
        
        this.edad = edad;
    }
    
    public String toString(){
        return "El gatito "+this.nombre+" tiene de edad "+this.edad;
    }

}
