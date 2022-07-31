package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
         double a = 2;
         double b = a; // atribuição por valor

        a++;
        b--;

        System.out.println("a = " + a + " b = " + b);

        Data d1 = new Data(1,6,2022);

        d1.dia = 31;
        d1.mes = 12;
        d1.ano = 2021;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d1.obterDataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d1.obterDataFormatada());
        int c = 5;
        //alterarPrimitivo(c);
        System.out.println(c);
    }
    private static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

//    private static void alterarPrimitivo(int a) {
//        a++;
//    }
}
