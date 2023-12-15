package basic_project;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Return_Array {
	
		public static void main(String args[]) {
		
		    String var = "nagababunnaauu";
		    Map<Character,Integer> map= new HashMap<>();
		    char[] ch = var.toCharArray();
		    int count=0,counts=1;
		    for(int i=0;i<ch.length;i++) {
		    	if(!map.containsKey(ch[i])) {
		    		map.put(ch[i],count+1);
		    	}else {
		    		map.put(ch[i], map.get(ch[i])+1);
		    	}
		    	
		    	
		    }
		    Set<Character> keys = map.keySet();
		    
	        // Iterate through the keys and print them
	        
		    System.out.println(map.size());
		   char visited='1';
		    for(int i=0;i<ch.length;i++) {
		    	if(map.get(ch[i])>=2) {
		    		char specificKey = ' ';
		    		for(int j=i+1;j<ch.length;j++) {
		    		if(ch[i]==ch[j]) {
		    			counts++;
		    			ch[j]=visited;
		    			
		    		}
		    		
		    		}
		    		if(ch[i]!='1') {
		    			specificKey=ch[i];
		    			System.out.println(ch[i]);
		    		}
		    		
		    		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
		                if (entry.getKey().equals(specificKey)) {
		                    // Key found, print the corresponding value
		                    System.out.println("Value for " + specificKey + ": " + entry.getValue());
		                    break;  // Optional: exit the loop once the key is found
		                }
		            }
		    		
		    	}
		    }
		    

	    }
	    }  
	

