package Pradeep1_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class class1 {

	public static void main(String args[]){
		
		// array list travesing throuhg iterable 
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("pradeep");
		list.add("ravi");
		list.add("pradeep");
		list.add("boolchandani");
		list.add("pp");
		
		Iterator<String > iterate = list.iterator();
		
		while(iterate.hasNext()){
			
			System.out.println(iterate.next());
			
		}
	}
	
}
