package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> listArray1= new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		
		List<Integer> listArray2= new ArrayList<Integer>(Arrays.asList(1,2,8,4,9,7));
		
		System.out.println(listArray1);
		
		System.out.println(listArray2);
		
		for (Integer integer : listArray1) {
			 
		for (Integer integer2 : listArray2) {
		
			
		if(integer.equals(integer2))
		{
			
		System.out.println(integer);	
		}
	}
}		

	}
}