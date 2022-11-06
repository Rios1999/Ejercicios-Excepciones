/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio121;

/**
 *
 * @author peluj
 */
public class Piscina {

    public final int MAXNIVEL;
    private int nivel;

    public Piscina(int tope) {
        if (tope < 0) {
            tope = 0;
        }
        this.MAXNIVEL = tope;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void quitarAgua(int cantidad) throws PiscinaException{
        if(this.nivel-cantidad<0){
            throw new PiscinaException("Error el nivel queda por debajo de 0");
        }
        this.nivel -= cantidad;
    }

    public void ponerAgua(int cantidad) throws PiscinaException{
        if(this.nivel+cantidad>this.MAXNIVEL){
            throw new PiscinaException("Error el nivel queda por encima de "+this.MAXNIVEL);
        }
            this.nivel += cantidad;
    }
}
