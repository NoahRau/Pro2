package Lektion16.schach.schach;

public class Brett
{
  boolean[][] brett = new boolean[8][8];
  
  public Brett()
  {
    
  }
  public Brett kombiniere(Brett brett){

    for (int j = 0; j < 8; j++)
    {
      for (int i = 0; i < 8; i++)
      {
       if(brett.brett[j][i])this.brett[j][i]=true;
      }}
      return this;
  }
  
  public void markiereFeld(int x, int y)
  {
    brett[x-1][y-1] = true;
  }
  
  public boolean gibFeld(int x, int y)
  {
    return brett[x-1][y-1];
  }
  
}
