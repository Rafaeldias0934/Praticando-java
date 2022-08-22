package Vetores;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        // Declaração do tamanho do Array;
        int  qtdArray = 20;
        // Criação dos Arrays com as quantidades determinadas;
        String[] nome = new String[qtdArray];
        int[] media = new int[qtdArray];
        int[] qtdDefaltas = new int[qtdArray];

        // Declaração das variaveis para ler o nome do aluno,a media,e quantidade de Faltas.
        String nameDoAluno;
        int valorMedia, falta;

        // Estrutura de controle do tipo for para fazer a leitura dos nome do aluno, media e quantidades de faltas;
        for(int i = 0; i <= qtdArray - 1; i++){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o nome do aluno " + (i + 1));
            nameDoAluno = entrada.nextLine();
            System.out.println("Digite a media do aluno " + (i + 1));
            valorMedia = entrada.nextInt();
            System.out.println("Digite o numero de faltas do aluno " + (i + 1));
            falta = entrada.nextInt();
            // Atribuição do nome ao vetor alunos de quantidade 20
            nome[i] = nameDoAluno;
            // Atribuição da media ao vetor de quantidade 20
            media[i] = valorMedia;
            // Atribuição da quantiade de faltas ao vetor de quantidade 20
            qtdDefaltas[i] = falta;
        }
        // Chamada do medoto quantidade de Alunos Aprovados e impressão do resultado
        System.out.println("Quantidade de alunos aprovados : " + qtdDeAlunosAprovado(media, qtdDefaltas));
    }

    // Criação do metodo do tipo inteiro que retorna a quantidade de Alunos aprovados, com 2 parâmetros media e faltas.
    private static int qtdDeAlunosAprovado(int[] media, int[] faltas) {
        // Declaração e inicialização da variavel Quantidade de alunos aprovados.
        int qtdAlunosAprovados = 0;
        // criação do for para repetir de acordo com a quantidade do Array
        for(int i = 0; i < media.length; i++) {
            // Condição para calcular se a media é maior ou igual a 70 e as faltas é menor ou igual a 15
            if (media[i] >= 70 && faltas[i] <= 15) {
                // incremento da variavel quantidade de alunos +=1
                qtdAlunosAprovados++;
            }
        }
        // retorno do metodo com quantidade de Alunos Aprovados.
        return qtdAlunosAprovados;
    }
}
