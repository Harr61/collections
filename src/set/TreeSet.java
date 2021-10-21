package set;

import java.util.Iterator;

public class TreeSet {

    public static void main(String[] args) {

        java.util.TreeSet<String> treeCapitais = new java.util.TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Rio Branco");
        treeCapitais.add("Curitiba");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("São Paulo");

        System.out.println(treeCapitais);

//        retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.first());

//        retorna a ultima capital no final da arvore
        System.out.println(treeCapitais.last());

//        retorna a primeira capital abaixo na arvore da capital parametrizada
        System.out.println(treeCapitais.lower("Rio Branco"));

//        retorna a primeira capital acima na arovre da capital parametrizada
        System.out.println(treeCapitais.higher("Rio Branco"));

//        exibe todas as capitais no console
        System.out.println(treeCapitais);

//        retorna a primeira capital no topo da arvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

//        retorna a primeira capital no final da arvore, removendo do set
        System.out.println(treeCapitais.pollLast());

//        exibe todas as capitais no console
//        System.out.println(treeCapitais);
//        Iterator<String> iterator = treeCapitais.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        for (String capital: treeCapitais) {
//            System.out.println(capital);
//        }

    }

}
