package lavz.generics;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);

        List<String> list1 = new ArrayList<String>();
        list1.add("hello");
        String s1 = list1.get(0);   // no cast
        System.out.println(s1);
    }
}
