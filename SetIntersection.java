import java.util.*;

public class SetIntersection {

    public static Set<Integer> findIntersection(List<Set<Integer>> sets) {
        if (sets == null || sets.isEmpty()) {
            return new HashSet<>();
        }

        Set<Integer> intersectionSet = new HashSet<>(sets.get(0));

        for (Set<Integer> set : sets) {
            intersectionSet.retainAll(set);
        }

        return intersectionSet;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(3, 4, 5));

        List<Set<Integer>> sets = Arrays.asList(set1, set2, set3);

        System.out.println("HashSet Intersection: " + findIntersection(sets));

        Set<Integer> linkedSet1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> linkedSet2 = new LinkedHashSet<>(Arrays.asList(2, 3, 4));
        Set<Integer> linkedSet3 = new LinkedHashSet<>(Arrays.asList(3, 4, 5));
        List<Set<Integer>> linkedSets = Arrays.asList(linkedSet1, linkedSet2, linkedSet3);
        System.out.println("LinkedHashSet Intersection: " + findIntersection(linkedSets));

        Set<Integer> treeSet1 = new TreeSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> treeSet2 = new TreeSet<>(Arrays.asList(2, 3, 4));
        Set<Integer> treeSet3 = new TreeSet<>(Arrays.asList(3, 4, 5));
        List<Set<Integer>> treeSets = Arrays.asList(treeSet1, treeSet2, treeSet3);
        System.out.println("TreeSet Intersection: " + findIntersection(treeSets));
    }
}
