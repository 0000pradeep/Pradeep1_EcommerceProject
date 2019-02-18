package Pradeep1_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class class5 {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("ravi");
		set.add("vijay");
		set.add("ravi");
		set.add("ajay");
		Iterator<String> iterate = set.iterator();
		
		while(iterate.hasNext()){
			
			System.out.println(iterate.next());
		}

	}

}
