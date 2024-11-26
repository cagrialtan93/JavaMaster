import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaClass {
    record Person(String firstName, String lastName) {
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Selim", "Altan"),
                new Person("Sevilay", "Altan"),
                new Person("Ümran", "Altan"),
                new Person("Çağrı", "Altan")
        ));

        var comparatorLastName = new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName.compareTo(o2.lastName);
            }
        };

        list.sort((o1, o2) -> o1.lastName.compareTo(o2.lastName));
        System.out.println(list);
    }
}
