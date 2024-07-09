import java.util.ArrayList;
import java.util.Collections;

public class ReverseNamesList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Lisa");
        names.add("Billy");
        names.add("Tom");
        names.add("Jacob");
        names.add("Steven");
        names.add("Stefan");
        names.add("Bruce");
        names.add("Clark");
        names.add("Dianna");
        names.add("Barry");
        names.add("Guy");
        names.add("Hal");
        names.add("Carter");
        names.add("Wally");
        names.add("Tim");
        names.add("Raven");
        names.add("Vick");
        names.add("Steve");
        names.add("Tony");

        System.out.println("Original names list: " + names);

        Collections.reverse(names);

        System.out.println("Reversed names list: " + names);
    }
}