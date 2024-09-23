import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
    private String name;
    private int age;

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
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class PersonSetOperations {
    private Set<Person> personSet;

    public PersonSetOperations() {
        personSet = new HashSet<>();
    }

    public void addPerson(Person person) {
        if (personSet.add(person)) {
            System.out.println(person + " added to the set.");
        } else {
            System.out.println(person + " is already in the set.");
        }
    }

    public boolean containsPerson(Person person) {
        return personSet.contains(person);
    }

    public static void main(String[] args) {
        PersonSetOperations operations = new PersonSetOperations();

        Person alice = new Person("Alice", 30);
        Person bob = new Person("Bob", 25);
        Person anotherAlice = new Person("Alice", 30);

        operations.addPerson(alice);
        operations.addPerson(bob);

        boolean isAliceInSet = operations.containsPerson(anotherAlice);
        System.out.println("Is Alice (30) in the set? " + isAliceInSet);
    }
}
