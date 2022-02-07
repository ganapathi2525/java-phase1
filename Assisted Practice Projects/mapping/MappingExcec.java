package mapping;
import java.util.*;
public class MappingExcec {
	public static void main(String[] args)
	{
//Hashmap
		HashMap<Integer,String> HM=new HashMap<Integer,String>();  
		
		HM.put(1,"chandu");    
		HM.put(2,"sai");    
		HM.put(3,"praveen");   
	       
	      System.out.println("The elements of Hashmap are: ");  
	      for(Map.Entry m:HM.entrySet())
	      {    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
//HashTable
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"suresh");  
	      ht.put(5,"sainadh");  
	      ht.put(6,"srinu");  
	
	      System.out.println("\nThe elements of HashTable are: ");  
	      for(Map.Entry n:ht.entrySet())
	      {    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
//TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();   
	      
	      map.put(8,"hemanth");    
	      map.put(9,"anand");    
	      map.put(10,"swaroop");       
	      
	      System.out.println("\nThe elements of TreeMap are: ");  
	      for(Map.Entry l:map.entrySet())
	      {    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  

}
