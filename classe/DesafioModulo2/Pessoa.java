package classe.DesafioModulo2;

public class Pessoa {
    private String nomedaPessoa;
    private double pesoDaPessoa;

    private int idade;

    //private boolean podeDirigir;

    Pessoa(String nomedaPessoa, double pesoDaPessoa, int idade) {
        this.nomedaPessoa = nomedaPessoa;
        this.pesoDaPessoa = pesoDaPessoa;
        this.idade = idade;
    }
//    double Comer(double PesoDaComida) {
//        return PesoDaComida + pesoDaPessoa;
//    }
//
//    public String getNomedaPessoa() {
//        return nomedaPessoa;
//    }
//
//    public double getPesoDaPessoa() {
//        return pesoDaPessoa;
//    }

    private boolean getPodeDirigir(){

        return idade >= 18;
    }

    @Override
    public String toString() {
        return "O nome da pessoa é ='" + nomedaPessoa + '\'' +
                ", ela tem o peso=" + pesoDaPessoa +
                ", e idade=" + idade +
                ", e podeDirigir=" + getPodeDirigir() ;

    }
}

