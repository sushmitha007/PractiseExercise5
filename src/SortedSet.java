import java.util.*;
import java.lang.String;
import java.util.TreeSet;
public class SortedSet {
    public static void main(String[] args) {
        // Create a sorted set of some names
        Set <String> sortedNames = new TreeSet<String>();
        sortedNames.add("Java");
        sortedNames.add("SQL");
        sortedNames.add("HTML");
        sortedNames.add("CSS");

        // Print the sorted set of names
        System.out.println(sortedNames);
        System.out.println( new ArrayList<>(sortedNames));
    }
}

