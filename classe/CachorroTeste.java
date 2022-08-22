package classe;

public class CachorroTeste {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.raca = "Buldogue";
        cachorro1.peso = 23;
        cachorro1.corOlhos = "Cinzas";
        cachorro1.qtdPatas = 4;

        Cachorro cachorro2 = new Cachorro();
        cachorro2.raca = "Rex";
        cachorro2.peso = 12;
        cachorro2.corOlhos = "Azuis";
        cachorro2.qtdPatas = 4;

        System.out.printf("Raça: %s\n Peso: %d\n Cor de Olhos: %s\n Quantidade de patas: %d\n",cachorro1.raca,cachorro1.peso,cachorro1.corOlhos,cachorro1.qtdPatas);
        System.out.printf("Raça: %s\n Peso: %d\n Cor de Olhos: %s\n Quantidade de patas: %d",cachorro2.raca,cachorro2.peso,cachorro2.corOlhos,cachorro2.qtdPatas);
    }

}
