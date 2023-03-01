public class Main {
    public static void main(String[] args) {
        GenericsClass<Integer> intObj = new GenericsClass<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());

        GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
        System.out.println("Generic Class returns: " + stringObj.getData());

          IData<String> d3 = new GenericsClass<>("Implemented Generic Interface");
        System.out.println(d3.getData());
    }
}