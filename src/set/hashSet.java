package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(7.0);
        notasAlunos.add(5.0);
        notasAlunos.add(3.5);
        notasAlunos.add(9.5);
        notasAlunos.add(3.0);
        notasAlunos.add(8.0);
        System.out.println(notasAlunos);

//        remove a nota do set
        notasAlunos.remove(3.5);
        System.out.println(notasAlunos);

//        retorna a quantidade de itens do set
        System.out.println(notasAlunos.size());

//        navega em todos os itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext()) {
            System.out.println("->" + iterator.next());
        }
        for (Double nota: notasAlunos) {
            System.out.println("-->>" + nota);
        }

        notasAlunos.clear();

        System.out.println(notasAlunos.isEmpty());

    }
}
