import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class LambdaEx3 {
    private Integer key;
    private String value;
    public LambdaEx3(Integer id, String name)
    {
        this.key = id;
        this.value = name;
    }
    public Integer getkey() { return key; }
    public String getvalue() { return value; }
}
class Mains {
    public static void main(String[] args) {
        List<LambdaEx3> list = new ArrayList<>();

        list.add(new LambdaEx3(1, "I"));
        list.add(new LambdaEx3(2, "have"));
        list.add(new LambdaEx3(3, "my"));
        list.add(new LambdaEx3(4, "own"));
        list.add(new LambdaEx3(5, "roles"));

        Map<Integer, String> map = new HashMap<>();

        //for loop
         for (LambdaEx3 n : list) {
             map.put(n.getkey(), n.getvalue());
         }
        // lambda expression
        list.forEach(
                (n) -> {
                    map.put(n.getkey(), n.getvalue());
                });
        System.out.println("Map : " + map);
    }
}
