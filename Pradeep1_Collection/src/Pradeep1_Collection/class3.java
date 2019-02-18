package Pradeep1_Collection;

import java.util.ArrayList;
import java.util.Iterator;

class class3_1{
	
	String name;
	String surname;
	int marks;
	
	class3_1(String name , String surname , int marks){
		this.name = name;
		this.surname = surname;
		this.marks = marks;
		
	}
	
	
	
}
public class class3 {

	public static void main(String[] args) {
		
		class3_1 obj1 = new class3_1("pradeep1","bool1",10);
		class3_1 obj2 = new class3_1("pradeep2","bool2",20);
		class3_1 obj3 = new class3_1("pradeep3","bool3",30);
		
		ArrayList<class3_1> list = new ArrayList<class3_1>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
		Iterator<class3_1> iterate = list.iterator();
		
		while(iterate.hasNext()){
			
			class3_1 obj = (class3_1)iterate.next();
			
			System.out.println(obj.name + " "+obj.surname+" "+obj.marks);
		}
		

	}

}
