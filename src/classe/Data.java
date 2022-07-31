package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data() {
        /*
        dia = 1;
        mes = 1;
        ano = 1970;
         */
        this(1, 1, 1970);
    }
    Data(int dia, int mes,int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    String obterDataFormatada() {
        String formato = "%d/%d/%d.\n";
        return String.format(formato,this.dia,mes,ano);
    }

    public void imprimirDataFormatada() {
        System.out.println(obterDataFormatada()); // System.out.println("%d/%d/%d.\n",dia,mes,ano);
    }
}
