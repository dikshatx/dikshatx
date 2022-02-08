import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(2);

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list.contains("A"));

        System.out.println(list.contains("Z"));
    }

}

