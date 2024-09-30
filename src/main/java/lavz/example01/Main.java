package lavz.example01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world " + args[0] + " " + args[1]);

        printVarArgs("lala", "lulu", "blabla");
    }

    public static void printVarArgs(String... args) {
        Arrays.stream(args).forEach(System.out::println);
    }
}