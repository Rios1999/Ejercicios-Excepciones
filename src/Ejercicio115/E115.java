package Ejercicio115;

import java.util.Scanner;

import java.util.InputMismatchException;

public class E115 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean com = true;
        double lista[];
        int tamanio;
        int cont = 0;

        System.out.println("De que tamanio es la lista??");
        tamanio = scan.nextInt();
        lista = new double[tamanio];

        do {
            try {
                System.out.println("Introduce un valor numerico " + cont);
                lista[cont] = scan.nextDouble();
                if (cont == lista.length - 1) {
                    com = false;
                } else {
                    cont++;//le incremento el valor a cont
                }

            } catch (InputMismatchException e) {
                System.out.println("Se debe introducir un valor numerico....");
                scan.next();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error Fuera de rango");
                com = false;//CUIDADO!!
            }
        } while (com);

        System.out.print("El programa ha finalizado con estos datos: ");

        for (int i = 0; i < lista.length; i++) {

            if (i == lista.length - 1) {
                System.out.print(lista[i]);
            } else {
                System.out.print(lista[i] + ",");
            }
        }

        System.out.println();
    }

}
