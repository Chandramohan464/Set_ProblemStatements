import java.util.*;

public class FirstNonDuplicateFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, 6, 4, 7, 8, 5);
        
        Integer result = findFirstNonDuplicate(numbers);
        System.out.println("First Non-Duplicate Element: " + result);
    }

    public static Integer findFirstNonDuplicate(List<Integer> list) {
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        
        for (Integer num : list) {
            if (duplicates.contains(num)) {
                continue; 
            } else if (uniqueSet.contains(num)) {
                uniqueSet.remove(num);  
                duplicates.add(num);   
            } else {
                uniqueSet.add(num);
            }
        }
        
        return uniqueSet.iterator().hasNext() ? uniqueSet.iterator().next() : null;
    }
}
