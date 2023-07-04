package Pruefung.MusikstueckSammlung;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.TreeSet;

public class MusikSammlung  {
    HashMap<String,MusikStueck> sammlung;
    public MusikSammlung(){
        sammlung=new HashMap<>();
    }
    public void musikStueckEinfuegen(MusikStueck neu) throws IllegalArgumentException{
        sammlung.forEach((key,value)->{
            if(key.compareTo(neu.titel)==0)throw new IllegalArgumentException("Gleiches lied existiert bereits");
        });
        einfuegen(neu);
    }
    public void einfuegen(MusikStueck neu){
        sammlung.put(neu.titel,neu);
    }
    public MusikStueck[] getAlleMusikStueckeNachTitel(){
        TreeSet<MusikStueck> x =new TreeSet<>(new VergleicheMusikStueckTitel<>());
        sammlung.forEach((key,value)->x.add(value));
        MusikStueck[] y = new MusikStueck[x.size()];
        final int[] insad = {0};
        x.forEach((value)->{
            y[insad[0]]=value;
            insad[0]++;
        });

        return y;
    }
    public MusikStueck[] getAlleMusikStueckeNachlaenge(){
        TreeSet<MusikStueck> x =new TreeSet<>(new VergleicheMusikStueckLaenge<>());
        sammlung.forEach((key,value)->x.add(value));
        MusikStueck[] y = new MusikStueck[x.size()];
        final int[] insad = {0};
        x.forEach((value)->{
            y[insad[0]]=value;
            insad[0]++;
        });

        return y;
    }
@Test
    public void testeSammlung(){
        MusikStueck aa = new MusikStueck("aa","xa",2);
        MusikStueck b = new MusikStueck("b","b",3);
        MusikStueck ac = new MusikStueck("ac","xc",4);
        MusikSammlung x =new MusikSammlung();
        x.musikStueckEinfuegen(aa);
        x.musikStueckEinfuegen(b);
        x.musikStueckEinfuegen(ac);
        MusikStueck[] as = x.getAlleMusikStueckeNachTitel();
        Assertions.assertThrows(IllegalArgumentException.class,()->x.musikStueckEinfuegen(aa));
        Assertions.assertSame(as[0],aa);
    Assertions.assertSame(as[2],b);
    Assertions.assertSame(as[1],ac);
    //System.out.println(aa.toString().split("\nDauer in s:")[1]);
    as=x.getAlleMusikStueckeNachlaenge();

    Assertions.assertSame(as[0],aa);
    Assertions.assertSame(as[1],b);
    Assertions.assertSame(as[2],ac);


}
}
