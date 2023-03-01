import java.util.ArrayList;
import java.util.HashSet;

public class ListToArray {

	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<>();        //arraylist method
//		//HashSet<String> list = new HashSet<>();          // hashset method
//		list.add("apple");
//		list.add("grapes");
//		list.add("banana");
//		list.add("mango");
//		list.add("pineapple");
//		System.out.println(list);
//		System.out.println(list.size());
//		String fruits[] = list.toArray(new String[list.size()]);
//		for(String str : fruits) {
//			System.out.println(str);
//		}
 ArrayList<Integer> list = new ArrayList<>();
 list.add(23);
 list.add(63);
 list.add(98);
 list.add(21);
 list.add(78);
 list.add(34);
 System.out.println(list);
 Integer int1[]= list.toArray(new Integer[list.size()]);
 for(Integer in : int1) {
 System.out.println(in);
 }
	}

}
