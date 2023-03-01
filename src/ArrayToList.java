import java.util.*;

public class ArrayToList {

	public static void main(String[] args) {
		String str[] = {"Sumedha", "Nikhil", "Prahlad", "Suchitra", "Kushal"};
		// Arrays.asList method
		ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
		for(String str1 : list) {
			System.out.println(str1);
		}
		
		//Collections method
		
		ArrayList<String> list1 = new ArrayList<>();
		Collections.addAll(list1, str);
		for(String str1 : list) {
			System.out.println(str1);
		}
	}

}
