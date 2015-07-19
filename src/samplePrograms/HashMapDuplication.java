package samplePrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDuplication {
	
	public static void main(String args[]){
		
		String s = "HELLOWORLD";
		
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0; i<s.length(); i++){
			
			//System.out.println(map.containsKey(s.charAt(i)));
			if(map.containsKey(s.charAt(i))){
				int value = map.get(s.charAt(i));
				map.put(s.charAt(i), value+1);
			}else {
				map.put(s.charAt(i), 1);
			}
			
		}
				
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry m = (Entry) it.next();
			System.out.println(m.getKey()+"----"+m.getValue());
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			map.put(entry.getKey(), entry.getValue());
			System.out.println(entry.getKey()+"!----!"+entry.getValue());
		}
		
	};
	

}
