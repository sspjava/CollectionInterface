import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "parrot");
		map.put(2, "crow");
		map.put(3, "sparrow");
		map.put(4, "chicken");
		System.out.println(map);
//		for(Map.Entry m: map.entrySet()) {
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
		for(Integer key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}

}
