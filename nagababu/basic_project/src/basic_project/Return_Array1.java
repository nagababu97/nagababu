package basic_project;

import java.util.HashMap;
import java.util.Map;


public class Return_Array1 {
	

	
	    public static void main(String args[]) {

	        String var = "nagababu";
	        Map<Character, Integer> map = new HashMap<>();
	        char[] ch = var.toCharArray();

	        for (int i = 0; i < ch.length; i++) {
	            if (!map.containsKey(ch[i])) {
	                map.put(ch[i], 1);
	            } else {
	                map.put(ch[i], map.get(ch[i]) + 1);
	            }
	        }

	        
	       
	                for(Map.Entry<Character, Integer> entry : map.entrySet()) {
	                	if(entry.getValue()>1) {
	                		System.out.println(" duplicate key: "+entry.getKey()+" value:"+entry.getValue() );
	                	}
	                }
	                System.out.println();
	            }
	    
	        
	    
	}


