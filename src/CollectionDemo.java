import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("John");
        for(String obj : list){
            String str = obj;
            System.out.println(str);
        }
    }
}
