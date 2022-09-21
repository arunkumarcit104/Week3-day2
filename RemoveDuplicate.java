package week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="We Learn java basics as part of java week1";
		
        String[] values=text.split(" ");
        List<String> arryVal=new ArrayList<String>();
        

        


		for (String string : values) {
	
			if (arryVal.contains(string)) {
			arryVal.add("");
		}  else {
			arryVal.add(string);
				
		}
		}
		System.out.print("First Type " +arryVal);
		
		///Type 2 
	      List<String> arryVal1=new ArrayList<String>();
		for (String string : values) {
			
			arryVal1.add(string);
		}
		
        Set<String> hasVal=new LinkedHashSet<String>(arryVal1);
        
        System.out.println("Second type "+ hasVal);
        
        
			
 }
       

}
			


			



