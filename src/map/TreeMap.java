package map;

import java.util.Iterator;
import java.util.Map;

public class TreeMap {

    public static void main(String[] args) {

        java.util.TreeMap<String, String> treeCapitais = new java.util.TreeMap<>();

        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Pailo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("BH", "Belo Horizonte");

        System.out.println(treeCapitais);

//        Retorna a primeira capital no top da arvore
        System.out.println(treeCapitais.firstKey());

//        retorna a ultima capital no final da arvore
        System.out.println(treeCapitais.lastKey());

//        retorna a primeira capital abaixo na arvore da capital parametrizada
        System.out.println(treeCapitais.lowerKey("SC"));

//        retorna a primeira capital acima na arvore da capital parametrizada
        System.out.println(treeCapitais.higherKey("SC"));

        System.out.println(treeCapitais);

//        retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.firstEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());

//        retorna a ultima capital no final da arvore
        System.out.println(treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());

//        retorna a primeira capital abaixo na arvore da capital parametrizada
        System.out.println(treeCapitais.lowerEntry("SC").getKey() + " - " + treeCapitais.lowerEntry("SC").getValue());

//        retorna a primeira capital acima na arvore da capital parametrizada
        System.out.println(treeCapitais.higherEntry("SC").getValue() + " - " + treeCapitais.higherEntry("SC").getValue());

        System.out.println(treeCapitais);

        Map.Entry<String, String> firsEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();

//        retorna a primeira capital no topo da arvore removwendo do map
        System.out.println(firsEntry.getKey() + " - " + firsEntry.getValue());

//        retorna a primeira capital no final da arvore removendo do map
        System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());

        System.out.println(treeCapitais);

//        navega em todos as chaves do iterator
        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " - " + treeCapitais.get(key));
        }
        for (String capital : treeCapitais.keySet()) {
            System.out.println(capital + " - " + treeCapitais.get(capital));
        }
        for (Map.Entry<String, String> capital: treeCapitais.entrySet()) {
            System.out.println(capital.getKey() + " - " + capital.getValue());
        }

    }

}
