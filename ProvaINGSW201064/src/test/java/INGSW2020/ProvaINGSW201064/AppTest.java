package INGSW2020.ProvaINGSW201064;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
       
    	int[] a = {1, 5, 17, 36, 80, 91};
    	int[] testA = {80, 91, 1, 17, 5, 36};
    	
    	assertTrue(a.equals(myList.ordineCrescente(testA)));
    	
    	int[] b = {1, 21, 144, 231, 988, 1000};
    	int[] testB = {1000, 21, 231, 144, 1, 988};
    	assertTrue(b.equals(myList.ordineCrescente(testB)));
    }
    
    @Test
    public void ordineDecrescenteWorks() {
    	int[] a = {91, 80, 36, 17, 5, 1};
    	int[] testA = {80, 91, 1, 17, 5, 36};
    	
    	assertTrue(a.equals(myList.ordineCrescente(testA)));
    	
    	int[] b = {1000, 988, 231, 144, 21, 1};
    	int[] testB = {1000, 21, 231, 144, 1, 988};
    	assertTrue(b.equals(myList.ordineCrescente(testB)));
    }
}
