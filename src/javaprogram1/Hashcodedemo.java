package javaprogram1;

import java.util.HashMap;
import java.util.Map;

public class Hashcodedemo {

	public static void main(String[] args) {
		Hashinherit ob1=new Hashinherit(10,5000,"Bhanu");
		Hashinherit ob2=new Hashinherit(11,6000,"Bhanu");
		Hashinherit ob3=new Hashinherit(11,7000,"Bhanu");
		Hashinherit ob4=new Hashinherit(13,8000,"Bhanu");
		Hashinherit ob5=new Hashinherit(14,9000,"Bhanu");
		Hashinherit ob6=new Hashinherit(11,5000,"Bhanu");
	
	//ob1.setB(2);
	//int c=ob1.getB();
	
	System.out.println(ob1);
	HashMap<Hashinherit,Integer> h1=new HashMap<Hashinherit,Integer>();
	h1.put(ob1,ob1.getRoll());
	h1.put(ob2,ob1.getRoll());
	h1.put(ob3,ob1.getRoll());
	h1.put(ob4,ob1.getRoll());
	h1.put(ob5,ob1.getRoll());
	h1.put(ob6,ob1.getRoll());
	//System.out.println(h1.get(1));
	for(Map.Entry d:h1.entrySet() )
	{
		System.out.println(d.getKey()+ " ------  "+d.getValue());
	}
	
	
	}

	
	
	
	
	
}
