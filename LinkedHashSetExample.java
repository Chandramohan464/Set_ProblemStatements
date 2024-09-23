import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apple", "orange");

        Set<String> result = removeDuplicates(strings);
        System.out.println("LinkedHashSet: " + result);
    }

    public static Set<String> removeDuplicates(List<String> list) {
        Set<String> linkedHashSet = new LinkedHashSet<>(list);
        return linkedHashSet;
    }
}
