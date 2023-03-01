import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {
    public static void main(String[] args) {
        List<String> flowers = Arrays.asList("Rose","Jasmine","Sunflower","Lilly","Hibiscus");

        List<Integer> length = flowers.stream().map(f->f.length()).collect(Collectors.toList());
        System.out.println(length);
    }
}
