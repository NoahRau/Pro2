package Lektion24;

import java.util.List;
import java.util.stream.Collectors;

public class BBruder {

        String name;
        int bankDrueckenGewicht;
        int knieBeugenGewicht;
 public BBruder(String name, int bankDrueckenGewicht, int
        knieBeugenGewicht)
        {
            this.name = name;
            this.bankDrueckenGewicht = bankDrueckenGewicht;
            this.knieBeugenGewicht = knieBeugenGewicht;
        }

        @Override
        public String toString()
        {
            return String.format(
                    "Name: %s, Bankdrücken: %dkg, Kniebeugen %dkg",
                    name, bankDrueckenGewicht, knieBeugenGewicht);
        }
        public static void main(String[] args)
        {
            List<BBruder> bBrothers = List.of(new BBruder("Burt", 238, 311),
                    new BBruder("Bronski", 200, 274),
                    new BBruder("Bruno", 236, 328));
            //a)
            bBrothers.stream().map((b1->b1.name)).reduce((a,b)->b!=null? a+" , "+b:a).ifPresent(System.out::println);
            //b)
            System.out.println(bBrothers.stream().mapToDouble(b1 -> b1.bankDrueckenGewicht).reduce(Double::sum).getAsDouble() / bBrothers.size());
            //c)
            System.out.println(bBrothers.stream().map(b1 -> b1.name).collect(Collectors.joining(", ")));
            //d
            bBrothers.stream().mapToDouble(b1 -> b1.bankDrueckenGewicht).average().ifPresent(System.out::println);

        }
    }

