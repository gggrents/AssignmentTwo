import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void printData(Iterable<Person>  people) {
        for (Person i : people) {
            System.out.print(i);
            System.out.println(" earns " + i.getPaymentAmount() + " tenge");
        }
    }
    public static void main(String[] args) {
        Person person1 = new Employee("John","Lennon","Designer",27045.78);
        Person person2 = new Student("Ringo","Starr", 2.5);
        Person person3 = new Employee("George","Harrison","Engineer", 50000.00);
        Person person4 = new Student("Paul","McCartney", 3.15);


        ArrayList<Person> people = new ArrayList<Person>(4);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        Collections.sort(people);
        printData(people);
    }
}

