package queue;

import java.util.Iterator;
import java.util.Queue;

public class LinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new java.util.LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Fabio");
        filaBanco.add("Pamela");
        filaBanco.add("Guilbert");

        System.out.println(filaBanco);

//        Mostar o primeiro elemento e deleta ele
        String clienteAtendido = filaBanco.poll();
        System.out.println(clienteAtendido);
        System.out.println(filaBanco);

//        mostra o primeiro elemento mas não o deleta e se não existir elemento ele retorna null
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

//        mostra o primeiro elemento mas não o deleta e se não existir elemento ele retorna um erro
//        filaBanco.clear();
        String clienteErro = filaBanco.element();
        System.out.println(clienteErro);
        System.out.println(filaBanco);

        for (String cliente: filaBanco){
            System.out.println("->" + cliente);
        }

        Iterator<String> iteratorBanco = filaBanco.iterator();

        while (iteratorBanco.hasNext()){
            System.out.println("--->" + iteratorBanco.next());
        }

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());

        filaBanco.add("Wesley");
        System.out.println(filaBanco);

    }
}
