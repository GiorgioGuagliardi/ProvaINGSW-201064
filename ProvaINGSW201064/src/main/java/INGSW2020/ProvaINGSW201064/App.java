package INGSW2020.ProvaINGSW201064;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
       MyListUtil myList = new MyListUtil();
       int[] a = {3, 33, 12, 1, 7, 19};
       
      System.out.println(a.length); 
      
       myList.ordineCrescente(a);
       System.out.println("cambio");
       myList.ordineDecrescente(a);
       
    }
}
