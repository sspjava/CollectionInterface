import java.util.Arrays;
import java.util.List;

public class ParallelVssequentialStream {
    public static void main(String[] args)
    {
        List<String> list1 = Arrays.asList("Hello ", "G", "E", "E", "K", "S!");
        // method for parallel stream
        list1.parallelStream().forEach(System.out::print);
        System.out.println('\n');
        List<String> list2 = Arrays.asList( "Hello ","G", "E", "E", "K", "S!");
        // method for sequential stream
        list2.stream().forEach(System.out::print);
    }
}
