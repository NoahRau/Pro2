package Lektion14;

public class Strecke {
    int a;
    int b;
    public Strecke(int a, int b){
        if(a<0||b<0)throw new RuntimeException();
        if(a<=b){
            this.a=a;
            this.b=b;
        }
        else {
            this.a=b;
            this.b=a;
        }
    }
    public static boolean ueberschneidung(Strecke first,Strecke second)

    {
        int anfang = first.a;
        int ende =first.b;
        int anfangzwei=second.a;
        if(first.a>second.a)
        {
             anfang = second.a;
             ende =second.b;
             anfangzwei=first.a;
        }
        for(int i= anfang;ende>=i;i++){
            if(i==anfangzwei)return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String rueck="";
        rueck+=a;
        if(a==b)return rueck;
        for(int i =a;b>i;i++)rueck+="-";
        rueck+=b;
        return rueck;
    }
    }

