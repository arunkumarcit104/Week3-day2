package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> listArray= new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
		int count=0;
		
		

		for (Integer integer : listArray) {
		count=0;
			for (Integer integer2 : listArray) {
				
				if(integer.equals(integer2))
				{
				
					count ++;

				}
			}
			
			if (count>1) {
				
				System.out.println(integer);
			}
			
		}
	
 }
			


}
