import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person other) {
        int ageCompare = Integer.compare(this.age, other.age);
        return ageCompare != 0 ? ageCompare : this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class PersonSetOperation {

    public static Set<Person> union(Set<Person> set1, Set<Person> set2) {
        Set<Person> resultSet = new TreeSet<>(set1);
        resultSet.addAll(set2);
        return resultSet;
    }

    public static Set<Person> difference(Set<Person> set1, Set<Person> set2) {
        Set<Person> resultSet = new TreeSet<>(set1);
        resultSet.removeAll(set2);
        return resultSet;
    }

    public static void main(String[] args) {
        Set<Person> set1 = new TreeSet<>(Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25)
        ));

        Set<Person> set2 = new TreeSet<>(Arrays.asList(
                new Person("Bob", 25),
                new Person("Charlie", 35)
        ));

        Set<Person> unionSet = union(set1, set2);
        Set<Person> differenceSet = difference(set1, set2);

        System.out.println("Union: " + unionSet);
        System.out.println("Difference: " + differenceSet);
    }
}
