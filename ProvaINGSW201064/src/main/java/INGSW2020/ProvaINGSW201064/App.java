package INGSW2020.ProvaINGSW201064;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
       MyListUtil myList = new MyListUtil();
       ArrayList<Integer> l = new ArrayList<Integer>();
       l.add(3);
       l.add(33);
       l.add(12);
       l.add(1);
       l.add(7);
       l.add(19);
       
       myList.ordineCrescente(l);
       myList.ordineDecrescente(l);
    }
}
