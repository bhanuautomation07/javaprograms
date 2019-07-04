package javaprogram1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		int s1[]= {2,3,1,5,3,6,4,5,1,8,6,9,4,2,5,7};
		HashMap<Integer,Integer> e=new HashMap<Integer,Integer>();
		
   
		e.put(s1[0], 1);
		int i;
		for(i=1;i<s1.length;i++)
		{
		boolean b=	e.containsKey(s1[i]);
		if (b)
		{
			e.put(s1[i], e.get(s1[i])+1);
		}
		else
		{
			e.put(s1[i], 1);
		}
		//System.out.println(s1[i] + "   "+e.get(s1[i]));
		
		}
		//System.out.println(e);
		System.out.println(e.size());
		for(Map.Entry c:e.entrySet() )
		{
			System.out.println(c.getKey()+ "   "+c.getValue());
		}
	}

}
