package map;

import java.util.Map;

public class HashMap {

    public static void main(String[] args) {

        Map<String, Integer> mundialFila = new java.util.HashMap<>();

        mundialFila.put("Brasil", 5);
        mundialFila.put("Alemanha", 4);
        mundialFila.put("Itália", 4);
        mundialFila.put("Uruguai", 2);
        mundialFila.put("Argentina", 2);
        mundialFila.put("França", 2);
        mundialFila.put("Espanha", 1);

        System.out.println(mundialFila);

//        Atualizando o valor para a chave Brasil
        mundialFila.put("Brasil", 6);
        System.out.println(mundialFila);

//        Retorna a Argentina
        System.out.println(mundialFila.get("Argentina"));

//        Retorna se existe ou não um campeão frança
        System.out.println(mundialFila.containsKey("França"));

//        Remove o campeao França
        mundialFila.remove("França");

//        Retorna se existe ou não um campeão França
        System.out.println(mundialFila.containsKey("França"));

//        Retorna se existe ou não alguma seleção hexa campeã
        System.out.println(mundialFila.containsValue(6));

//        Retorna o tamanho do mapa
        System.out.println(mundialFila.size());

        System.out.println(mundialFila);

//        navega nos registros do mapa
        for (Map.Entry<String,Integer> entry : mundialFila.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

//        navega nos registros do mapa
        for (String key : mundialFila.keySet()) {
            System.out.println(key + " -- " + mundialFila.get(key));
        }

        System.out.println(mundialFila);

//        Verifica se o mapa contem a chava estados unidos
        System.out.println(mundialFila.containsKey("Estados Unidos"));

//        verifica se o mapa contem o valor 5
        System.out.println(mundialFila.containsValue(5));

//        verifica o tamanho antes e depois de limpar o mapa
        System.out.println(mundialFila.size());

        mundialFila.clear();

        System.out.println(mundialFila.size());

    }


}
