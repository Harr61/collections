package comparators;

import java.util.Comparator;

public class EstudanteComparators implements Comparator<Estudante> {

    public int compare(Estudante o1, Estudante o2) {
        return o2.getIdade() - o1.getIdade();
    }

}
