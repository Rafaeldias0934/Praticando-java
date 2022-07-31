package classe.DesafioModulo2;

import java.util.Objects;

public class Comida {
    private String nomeDaComida;
    private double pesoDaComida;

    Comida() {

    }




    public void setNomeDaComida(String nomeDaComida) {
        this.nomeDaComida = nomeDaComida;
    }

    public void setPesoDaComida(double pesoDaComida){
        this.pesoDaComida = pesoDaComida;
    }

    public String getNomeDaComida() {
        return nomeDaComida;
    }

    public double getPesoDaComida() {
        return pesoDaComida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comida comida = (Comida) o;
        return Double.compare(comida.pesoDaComida, pesoDaComida) == 0 && Objects.equals(nomeDaComida, comida.nomeDaComida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDaComida, pesoDaComida);
    }
}
