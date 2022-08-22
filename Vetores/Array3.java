
package Vetores;
public class Array3 {
    public static void main(String[] args) {
        int i;
        String[] meses = {
                "Janeiro","fevereiro","Março","Abril",
                "Maio","Junho", "Julho", "Agosto", "Setembro",
                "Outubro","Novembro","Dezembro"
        };

        System.out.println("Listando os meses do ano");

        for (i = 0; i < 12; i++) {
            System.out.printf("Posição do Array: %d - Mês: %s\n",i, meses[i]);
        }
    }
}

