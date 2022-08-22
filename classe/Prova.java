package classe;

public class Prova {
    public static void main(String[] args) {
        int a = 19;
        int b = 3;
        int c;

        while(a > b) {
            a -= 3;
            b += 2;
            c = a - b;

            System.out.printf("%d *** ",c);
        }
    }
}
