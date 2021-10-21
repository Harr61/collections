package list;

import java.util.List;

public class Vector {

    public static void main(String[] args) {

        List<String> esportes = new java.util.Vector<>();

//        adicona elementos no vector
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tenis");
        esportes.add("Handebol");
        esportes.add("Volei");

        System.out.println(esportes);

//        altera o valor da posição 2 do vetor
        esportes.set(2, "Ping Pong");
        System.out.println(esportes);

//        remove o esporte da posição 2
        esportes.remove(2);
        System.out.println(esportes);

//        remove o elemento do vetor
        esportes.remove("Handebol");
        System.out.println(esportes);

//        retorna o primeiro elemento do vetor
        System.out.println(esportes.get(0));
        System.out.println(esportes);

        for (String esporte: esportes) {
            System.out.println("-->" + esporte);
        }


    }
}
