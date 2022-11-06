package Ejercicio121;

public class test {


    public static void main(String[] args) {
        
        Piscina p = new Piscina((int) Math.floor(Math.random() * (101 - 1) + 1));
        
        System.out.println("Nivel Piscina "+p.MAXNIVEL);
        
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Llenando....");
                p.ponerAgua((int) Math.floor(Math.random() * (26 - 1) + 1));
                System.out.println(p.getNivel());
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Vaciando....");
                p.quitarAgua((int) Math.floor(Math.random() * (26 - 1) + 1));
                System.out.println(p.getNivel());
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        
        

    }

}
