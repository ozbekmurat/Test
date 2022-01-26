package Second;

import java.util.ArrayList;

public class Wraper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int d=5; 
int k=6;
Integer ob = new Integer(d);//Boxing
Integer ok=k; //Auto-boxing
System.out.println(ob);
System.out.println(ok);

int t =ob.intValue();
System.out.println(t); //un-boxing

ArrayList students=new ArrayList<>();
students.add(100);
students.add(600000000L);
students.add("students");
students.add(120);

System.out.println(students.size());
System.out.println(students.size());

int v = ob.intValue();
System.out.println(v);

	}

}
