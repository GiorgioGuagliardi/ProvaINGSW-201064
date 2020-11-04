package INGSW2020.ProvaINGSW201064;

import java.util.ArrayList;

public class MyListUtil {

	public ArrayList<Integer> ordineCrescente(ArrayList<Integer> l) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for(int i = 0; i < l.size(); i++) {
			int temp = l.get(i);
			for(int j = i+1; j < l.size(); j++)
				if(l.get(i) < l.get(j)) {
					temp = l.get(i);
				}
			lista.add(temp);
		}
		
		for(int i = 0; i < lista.size(); i++)
			System.out.println(lista.get(i));
		
		return lista;
	}
	
	public ArrayList<Integer> ordineDecrescente(ArrayList<Integer> l) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for(int i = 0; i < l.size(); i++) {
			int temp = l.get(i);
			for(int j = i+1; j < l.size(); j++)
				if(l.get(i) > l.get(j)) {
					temp = l.get(i);
				}
			lista.add(temp);
		}
		
		for(int i = 0; i < lista.size(); i++)
			System.out.println(lista.get(i));
		
		return lista;
	}
}
