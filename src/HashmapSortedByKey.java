import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashmapSortedByKey {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<>();
		hashmap.put(67, "parrot");
		hashmap.put(23, "crow");
		hashmap.put(45, "sparrow");
		hashmap.put(78, "chicken");
		Map<Integer, String> map = new TreeMap<Integer, String>(hashmap);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry pair = (Map.Entry)itr.next();
			System.out.print(pair.getKey() + ": ");
			System.out.println(pair.getValue());
		}
	}
}
