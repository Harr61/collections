package map;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

//        remove um estudante no indice 0
        estudantes.remove("Pedro");

        System.out.println(estudantes);

        int idadeEstudante = estudantes.get("Mariana");

        System.out.println(idadeEstudante);

        System.out.println(estudantes.size());

//        navega nos registros do mapa
        for (Map.Entry<String, Integer> entry : estudantes.entrySet()) {
            System.out.println(entry.getKey() + " - " +entry.getValue());
        }
//        navega nos registros do map
        for (String key : estudantes.keySet()) {
            System.out.println(key + " -- " + estudantes.get(key));
        }

        System.out.println(estudantes);


    }

}
