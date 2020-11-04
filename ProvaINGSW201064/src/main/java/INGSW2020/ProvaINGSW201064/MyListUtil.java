package INGSW2020.ProvaINGSW201064;

import java.util.ArrayList;


public class MyListUtil {

	public int[] ordineCrescente(int[] lista) {
		int[] l = lista;
		//3 33 12 1 7 19
		
		for(int i = 0; i < l.length; i++) {
			for(int j = i+1; j < l.length; j++)
				if(l[j] < l[i]) {
					int temp = l[i];
					l[i] = l[j];
					l[j] = temp;
				}
		}
		for(int i = 0; i < l.length; i++)
			System.out.println(l[i]);
		return l;
	}
	
	public int[] ordineDecrescente(int[] lista) {
		int[] l = lista;
		//3 33 12 1 7 19
		for(int i = 0; i < l.length-1; i++) {
			for(int j = i+1; j < l.length-1; j++)
				if(l[j] > l[i]) {
					int temp = l[i];
					l[i] = l[j];
					l[j] = temp;
				}
		}
		for(int i = 0; i < l.length-1; i++)
			System.out.println(l[i]);
		return l;
	}
}
