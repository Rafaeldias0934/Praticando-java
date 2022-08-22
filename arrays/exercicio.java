package arrays;

import java.util.Arrays;

public class exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 8;
        notasAlunoA[1] = 7.5;
        notasAlunoA[2] = 8.2;
        notasAlunoA[3] = 4.5;

        String result = Arrays.toString(notasAlunoA);

        System.out.println(result);


        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }

        double mediaAlunoA = (totalAlunoA / notasAlunoA.length);

        System.out.printf("%.1f",mediaAlunoA);

        double[] notasAlunoB = { 4.3, 5.3, 7.2, 6.4 };

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }
        double mediaAlunoB = (totalAlunoB / notasAlunoB.length);
        System.out.printf("\n%.1f",mediaAlunoB);

    }
}
