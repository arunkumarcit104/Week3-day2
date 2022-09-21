package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MostDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="abbaba";
		
		char[] charArray = text.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for (int i=0;i<charArray.length;i++) {
		
			if(map.containsKey((charArray[i])))
			{
			map.put(charArray[i],map.get(charArray[i])+1);
			System.out.println(charArray[i]);
			break;
	
		}
		else {
		map.put(charArray[i],1);
		}
		
	}

	}
	
}
