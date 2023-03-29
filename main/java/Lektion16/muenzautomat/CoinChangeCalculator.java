package Lektion16.muenzautomat;

public class CoinChangeCalculator extends SimpleChangeCalculator implements ChangeCalculator{
    @Override
    public int[] getChange(int euros, int cent){
        int[] ausgabe= new int[8];
        while(euros-2>=0){
            euros-=2;
            ausgabe[7]+=1;
        }
        while(euros-1>=0){
            euros-=1;
            ausgabe[6]+=1;
        }

        while(cent-50>=0){
            cent-=50;
            ausgabe[5]+=1;
        }
        while(cent-20>=0){
            cent-=20;
            ausgabe[4]+=1;
        }
        while(cent-10>=0){
            cent-=10;
            ausgabe[3]+=1;
        }
        while(cent-5>=0){
            cent-=5;
            ausgabe[2]+=1;
        }
        while(cent-2>=0){
            cent-=2;
            ausgabe[1]+=1;
        }
        while(cent-1>=0){
            cent-=1;
            ausgabe[0]+=1;
        }
        return ausgabe;
    }
    public static void main(String[] args){
        CoinChangeCalculator coin =new CoinChangeCalculator();
        int[] ausgabe=coin.getChange(5,79);
        for(int i=0;ausgabe.length>i;i++){
            System.out.print("/"+ausgabe[i]);
        }
    }
}
