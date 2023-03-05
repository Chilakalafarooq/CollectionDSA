package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNullValuesFromListExample {
    public static void main(String[] args) {
        // Create a list with some null values
        List<String> list = Arrays.asList("foo", null, "bar", null, "baz");

        // Use Java 8 features to remove null values from the list
        list = list.stream()
                   .filter(x -> x != null)
                   .collect(Collectors.toList());

        // Print the resulting list
        System.out.println(list);
    }
}
