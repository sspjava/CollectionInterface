import java.util.*;
public class ArrayListSortInDescendingOrder {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("b");
		list.add("u");
		list.add("a");
		list.add("e");
		list.add("z");
		list.add("f");
		
		//Collections.reverseOrder method
		Collections.sort(list, Collections.reverseOrder());
		for(String str : list) {
			System.out.println(str);
		}
		
	}

}
