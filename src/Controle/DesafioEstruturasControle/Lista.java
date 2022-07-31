package Controle.DesafioEstruturasControle;

import java.util.ArrayList;
import java.util.Collections;

public class Lista {
    public static void main(String[] args) {
        String[] cores = {"Verde", "Azul", "Amarelo", "Preto", "Branco"};
        ArrayList<String> minhaLista = new ArrayList<>();

        Collections.addAll(minhaLista, cores);
        minhaLista.add("Roxo");
        minhaLista.add("magenta");

        minhaLista.remove("Magenta");
        for (String s : minhaLista) {
            System.out.println(s);
        }

    }
}

/*
Collections.addAll(minhaLista, cores);
minhaLista.add("Roxo");
minhaLista.add("magenta");

minhaLista.remove(6);
for (String s : minhaLista) {
    System.out.println(s);
}


for(int i = 0; i < cores.length; i++) {
            System.out.println(cores[i]);
        }

 */