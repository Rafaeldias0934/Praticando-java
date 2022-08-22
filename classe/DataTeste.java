package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();

        String dataFormatada = d1.obterDataFormatada();
        System.out.print(dataFormatada);

        /*
        var d2 = new Data(5,8,1994);

        d2.dia = 5;
        d2.mes = 8;
        d2.ano = 1994;

        System.out.print(d2.obterDataFormatada());
        //d1.imprimirDataFormatada();

         */
    }
}
