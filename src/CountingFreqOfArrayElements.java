import java.util.HashMap;
import java.util.Map;
public class CountingFreqOfArrayElements {
  static void countFreq(int arr[], int n) {
	  Map<Integer, Integer> map= new HashMap<Integer, Integer>();
	  for(int i =0;i<n;i++) {
		  if(map.containsKey(arr[i])) {
			  map.put(arr[i], map.get(arr[i]) + 1);
		  }else {
			  map.put(arr[i], 1);
		  }
	  }
	  for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
		  System.out.println(entry.getKey() + " "+ entry.getValue());
	  }
  }
	public static void main(String[] args) {
		int arr[]= {10,10,20,30,20,30,10,20,30,10};
		int n = arr.length;
		countFreq(arr, n);

	}

}
