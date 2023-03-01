import java.util.*;
public class HashMap {

	public static void main(String[] args) {
		Hashtable<Integer, String> hash = new Hashtable<>();
		   hash.put(6, "Parvatibai");
		   hash.put(100,"Rajendra"); 
		   hash.put(102,"Praveen"); 
		   hash.put(101,"Bipin"); 
		   hash.put(103,"Pankaj");
		   hash.put(6, "naveen");
		   hash.put(7, "Parvatibai");
		   for(Map.Entry m: hash.entrySet()) {
			   System.out.println(m.getKey()+" "+ m.getValue());
		   }
	}

}
