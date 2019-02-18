package Pradeep1_Collection;

import java.util.HashMap;
import java.util.Map;

public class class6 {

	public static void main(String[] args) {

HashMap<String, Integer> map = new HashMap<String , Integer>();

map.put("pradeep", 1);
map.put("ravi", 2);
map.put("rajat", 3);

for(Map.Entry<String, Integer> m : map.entrySet()){
	
	System.out.println(m.getKey() + " " + m.getValue());
	
	
}

	}

}
