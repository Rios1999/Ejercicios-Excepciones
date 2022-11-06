/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author peluj
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = 0;int num2 = 0;boolean salir = false;boolean com = false;int sum = 1;
        
        sum = 1;
        do{        
            try{
                /*if(!com){
                    System.out.println("Introduce numero uno: ");
                    num = scan.nextInt();
                }
                com = true;*/
                
                if(sum==1){
                    System.out.println("Introduce numero "+sum+":");
                    num = scan.nextInt();
                    sum++;
                }
                System.out.println("Introduce numero "+sum+":");
                num2 = scan.nextInt();
                sum++;  
                salir = true;
            }catch(InputMismatchException e){
                System.out.println("ERROR: Debe introducir numero enteros");
                scan.next();
            }
        }while(!salir);
    }
    
}
