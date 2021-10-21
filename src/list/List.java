package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class List {

    public static void main(String[] args) {

        java.util.List<String> nome = new ArrayList<>();

        nome.add("Marcia");
        nome.add("Gabriel");
        nome.add("Pedro");
        nome.add("joão");
        nome.add("Ana");

        System.out.println(nome);

//        ordena os nomes
        Collections.sort(nome);
        System.out.println(nome );

//        substituir um elemento pelo index
        nome.set(2, "larissa");
        System.out.println(nome);

//        remover o index
        nome.remove(2);
        System.out.println(nome);

//        print o index
        String nomes = nome.get(1);
        System.out.println(nomes);

//        informa o tamanho da list
        int tamanho = nome.size();
        System.out.println(tamanho);

//        busca pelo elemento
        boolean temAnderson = nome.contains("Ana");
        System.out.println(temAnderson);

//        fala se a list esta vazia ou com elemento
        boolean listVazia = nome.isEmpty();
        System.out.println(listVazia);

//        informa o index do elemnto
        int posicao = nome.indexOf("Ana");
        System.out.println(posicao);

//        inteirar o codigo tanto com 'for' quanto com o 'while'
        for (String no: nome) {
            System.out.println("-->" +  no);
        }
        Iterator<String> iterator = nome.iterator();
        while (iterator.hasNext()) {
            System.out.println("->" + iterator.next());
        }

//        esvazia a list
//        nome.clear();
//        System.out.println(nome);

    }

}
