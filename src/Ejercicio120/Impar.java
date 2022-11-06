/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio120;

/**
 *
 * @author peluj
 */
public class Impar{
    double numero;
    
    public Impar(double numero)throws ImparException{
        if(numero%2==0){
            throw new ImparException("Error: El numero introducido es par");
        }
        
        this.numero = numero;
    }
    
    public String toString(){
        return "Numero "+this.numero;
    }
}
