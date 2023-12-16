import java.util.Date;
import java.util.GregorianCalendar;

public class MainClass {
    public static void main(String[] args) {
        Person[] people = {
                new Student("Ivan Ivanov", 21, "2001681040", "STD"),
                new Faculty("Angel Golev", 36, "1", new Date(105, 1, 1), "professor"),
                new Staff("Konstantina Ivanova", 42, "A2", new Date(110, 5, 31), "Ucheben otdel")
        };

        for (Person person : people) {
            System.out.println(person);
        }

    }
}