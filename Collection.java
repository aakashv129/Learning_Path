import java.util.*;  
class Collection{  
	public static void main(String args[]){  
   		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
    		System.out.println("Initial Elements: "+hm);  
      		hm.put(100,"Aakash");    
      		hm.put(101,"Ajay");    
      		hm.put(102,"Vijay");   
      		System.out.println("After invoking put() method ");  
      		for(Map.Entry m:hm.entrySet()){    
       			System.out.println(m.getKey()+" "+m.getValue());    
      		}
      		hm.putIfAbsent(103, "Arav");  
      		System.out.println("After invoking putIfAbsent() method ");  
      		for(Map.Entry m:hm.entrySet()){    
           		System.out.println(m.getKey()+" "+m.getValue());    
      		}  
      		HashMap<Integer,String> map=new HashMap<Integer,String>();  
      		map.put(104,"Ananth");  
      		map.putAll(hm);  
      		System.out.println("After invoking putAll() method ");  
      		for(Map.Entry m:map.entrySet()){    
           		System.out.println(m.getKey()+" "+m.getValue());    
      		}  
      		hm.remove(101);
      		System.out.println("After invoking remove() method ");
      		for(Map.Entry m:map.entrySet()){    
           		System.out.println(m.getKey()+" "+m.getValue());    
      		}
 	}  
}  
