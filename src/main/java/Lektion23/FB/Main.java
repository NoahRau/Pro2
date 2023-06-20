package Lektion23.FB;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mannschaft> l = Mannschaft.createTabelle();
        l.stream().filter(m ->m.punkte>50).forEach(System.out::println);
        System.out.println();

        l.forEach(m->System.out.println(m.name));
        System.out.println();

        l.stream().filter(m->m.name.startsWith("F")).sorted(Comparator.comparing(m-> m.name)).forEach(m->System.out.println(m.name));
        System.out.println();

        System.out.println(l.stream().max(Comparator.comparing(m->m.gegentore)).get());
    }
}
