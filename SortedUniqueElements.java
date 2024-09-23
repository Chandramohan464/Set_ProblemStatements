import java.util.*;

public class SortedUniqueElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 2, 9, 1, 2, 9);
        
        Set<Integer> sortedSet = getSortedUniqueElements(numbers);
        System.out.println("TreeSet (Sorted Unique Elements): " + sortedSet);
    }

    public static Set<Integer> getSortedUniqueElements(List<Integer> list) {
        Set<Integer> treeSet = new TreeSet<>(list);
        return treeSet;
    }
}
