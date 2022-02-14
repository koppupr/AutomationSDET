package assignment4;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharHash_1 {

	  public void countDupChars(String str){
		  
		    Map<Character, Integer> map = new HashMap<Character, Integer>(); 
		 
		    char[] chars = str.toCharArray();
		   
		    for(Character ch:chars){
		      if(map.containsKey(ch)){
		         map.put(ch, map.get(ch)+1);
		      } else {
		         map.put(ch, 1);
		        }
		    }
		   
		    Set<Character> keys = map.keySet();
		 
		    for(Character ch:keys){
		      if(map.get(ch) > 1){
		        System.out.println("Char "+ch+" "+map.get(ch));
		      }
		    }
		  }
		 
		  public static void main(String a[]){
			  DuplicateCharHash_1 obj = new DuplicateCharHash_1();
		    System.out.println("String: SDET.TRAINING");
		    System.out.println("-------------------------");
		    obj.countDupChars("SDET.TRAINING");
		  
		    System.out.println("\nString: Broadridge");
		    System.out.println("-------------------------");
		    obj.countDupChars("Broadridge");
		 
		    System.out.println("\nString: #@$@!#$%!!%@");
		    System.out.println("-------------------------");
		    obj.countDupChars("#@$@!#$%!!%@");
		  }
		}
