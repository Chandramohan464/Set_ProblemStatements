import java.util.*;

public class SetOperations {
    public static boolean isSubset(Set<Integer> setA, Set<Integer> setB) {
        return setB.containsAll(setA); 
    }

    public static void main(String[] args) {
        Set<Integer> setAHash = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> setBHash = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("HashSet Subset Check: " + isSubset(setAHash, setBHash)); 

        Set<Integer> setALinked = new LinkedHashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> setBLinked = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("LinkedHashSet Subset Check: " + isSubset(setALinked, setBLinked));

        Set<Integer> setATree = new TreeSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> setBTree = new TreeSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("TreeSet Subset Check: " + isSubset(setATree, setBTree)); 

        Set<Integer> setANotSubset = new HashSet<>(Arrays.asList(1, 2, 5));
        Set<Integer> setBNotSubset = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Non-Subset Check: " + isSubset(setANotSubset, setBNotSubset)); 
    }
}
