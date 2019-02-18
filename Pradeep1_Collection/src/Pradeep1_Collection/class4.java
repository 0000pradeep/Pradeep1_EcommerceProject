package Pradeep1_Collection;

import java.util.ArrayList;
import java.util.Iterator;

class class4_1{
	
	String name;
	String surname;
	int marks;
	
	class4_1(String name , String surname , int marks){
		this.name = name;
		this.surname = surname;
		this.marks = marks;
		
	}
	
	
	
}
public class class4 {

	public static void main(String[] args) {
		
		class4_1 obj1 = new class4_1("pradeep1","bool1",10);
		class4_1 obj2 = new class4_1("pradeep2","bool2",20);
		class4_1 obj3 = new class4_1("pradeep3","bool3",30);
		
		ArrayList<class4_1> list = new ArrayList<class4_1>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
for(class4_1 c : list){
	
	System.out.println(c.name + " " + c.surname + " " + c.marks);
}		
		

	}

}
