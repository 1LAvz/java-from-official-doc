package lavz.generics;

public class Main {
    public static void main(String[] args) {
        /*IntegerBox<Integer> integerBox = new IntegerBox<>();

        integerBox.set(25);
        System.out.println(integerBox.get());*/

        MultipleTypeParam.Pair<String, Integer> p1 = new MultipleTypeParam.OrderedPair<>("Even", 8);
        MultipleTypeParam.Pair<String, String>  p2 = new MultipleTypeParam.OrderedPair<>("hello", "world");

    }
}
