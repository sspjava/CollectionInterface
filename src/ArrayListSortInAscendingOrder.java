import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSortInAscendingOrder {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(34);
		list1.add(76);
		list1.add(9);
		list1.add(111);
		list1.add(21);
		list1.add(3);
		
		
		// Collections.sort method with iterator
//		Collections.sort(list1);
//		Iterator<Integer> itr = list1.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		// Collections.sort method with for each method
//		for(int num : list1) {
//			System.out.println(num);
//		}
		
		//sort element in assending order without inbuilt method
		int temp =0;
		Integer arr[]= list1.toArray(new Integer[list1.size()]);
		for(int num1: arr)
		System.out.println(num1);
		
		for(int i =0;i<arr.length; i++) {
			for(int j =i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
				
			}
		}
		for(int num : arr)
		System.out.println(num);
	}

}
