package classe;

class Produto {

    String nome;
    private double proco;
    private static double desconto = 0.25;

    Produto(String notebook, double proco) {

        this.proco = proco;
    }
    /*
    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        proco = precoInicial;
    }
    */

    double precoComDesconto() {
        return proco * (1 - desconto);
    }
    double precoComDesconto(double descontoDoGerente) {
        return proco * (1 - desconto + descontoDoGerente);
    }
}
