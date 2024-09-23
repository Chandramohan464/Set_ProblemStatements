import java.util.*;

public class SetDemo{

    public static void main(String[] args) {
        
        List<Integer> list=Arrays.asList(5,3,5,1,2);

        Set<Integer> hashSet = new HashSet<>(list);
        System.out.println("HashSet: " + hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(list);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>(list);
        System.out.println("TreeSet: " + treeSet);
    }
}