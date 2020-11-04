package INGSW2020.ProvaINGSW201064;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;


public class AppTest 
{
   
	public static MyListUtil myList;
	
	@BeforeClass
	public static void prepare() {
		myList = new MyListUtil();
	}
	
    @Test
    public void ordineCrescenteWorks(){
       
    	ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(3);
        l.add(7);
        l.add(21);
        l.add(2);
        l.add(54);
        l.add(7);
        
        ArrayList<Integer> m = new ArrayList<Integer>();
        m.add(1);
        m.add(2);
        m.add(11);
        m.add(45);
        m.add(55);
        m.add(56);
        
        
        assertEquals(m, myList.ordineCrescente(l));
    }
    
    @Test
    public void ordineDecrescenteWorks() {
    	ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(56);
        l.add(11);
        l.add(45);
        l.add(55);
        l.add(2);
        l.add(1);
        
        ArrayList<Integer> m = new ArrayList<Integer>();
        m.add(56);
        m.add(55);
        m.add(45);
        m.add(11);
        m.add(2);
        m.add(1);
        assertEquals(m, myList.ordineCrescente(l));
    }
}
