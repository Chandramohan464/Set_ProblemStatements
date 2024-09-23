import java.util.*;

public class SetPerformanceComparison {

    public static void main(String[] args) {
        int numElements = 1_000_000;
        List<Integer> elements = new ArrayList<>();
        
        for (int i = 0; i < numElements; i++) {
            elements.add(i);
        }

        System.out.println("HashSet Performance:");
        measureSetPerformance(new HashSet<>(), elements);

        System.out.println("\nLinkedHashSet Performance:");
        measureSetPerformance(new LinkedHashSet<>(), elements);

        System.out.println("\nTreeSet Performance:");
        measureSetPerformance(new TreeSet<>(), elements);
    }

    public static void measureSetPerformance(Set<Integer> set, List<Integer> elements) {
        long startTime = System.currentTimeMillis();
        for (Integer element : elements) {
            set.add(element);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time to add elements: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (Integer element : elements) {
            set.contains(element);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to check contains: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (Integer element : elements) {
            set.remove(element);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to remove elements: " + (endTime - startTime) + " ms");
    }
}
