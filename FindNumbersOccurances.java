package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data[]=new int[] {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Map<Integer,Integer> map= new TreeMap<Integer,Integer>();
		
		for (int i : data) 
		
		{
			
			if(map.containsKey((i)))
			{
			map.put(i,map.get(i)+1);
			
		}else {
			
			map.put(i,1);
		}
		

	}
		  System.out.println(map);
}
	
}
