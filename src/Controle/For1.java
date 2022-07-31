package Controle;

public class For1 {
    public static void main(String[] args) {

        for (int i = 2; i < 1000; i*=2) {
            System.out.println(i);
        }



        int x = 2;
        for (;x < 10;) {
            System.out.println("x = " + x);
            x++;
       }
        // Laço infinito!
        /*for (;;) {
            System.out.println("Fim!");
        }
         */
    }
}
