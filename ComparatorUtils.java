import java.util.Comparator;

public class ComparatorUtils {
    public static Comparator<Person> getPersonNameComparator() {
        return Comparator.comparing(Person::getName);
    }

    public static Comparator<Person> getPersonAgeComparator() {
        return Comparator.comparingInt(Person::getAge);
    }

    public static Comparator<Student> getStudentNameComparator() {
        return Comparator.comparing(Student::getName);
    }

    public static Comparator<Student> getStudentAgeComparator() {
        return Comparator.comparingInt(Student::getAge);
    }

    public static Comparator<Person> getReversedPersonNameComparator() {
        return getPersonNameComparator().reversed();
    }

    public static Comparator<Student> getReversedStudentAgeComparator() {
        return getStudentAgeComparator().reversed();
    }

    public static Comparator<Person> getPersonNameThenAgeComparator() {
        return getPersonNameComparator().thenComparing(getPersonAgeComparator());
    }

    public static Comparator<Person> getPersonNameComparatorWithNullsFirst() {
        return Comparator.nullsFirst(getPersonNameComparator());
    }

    public static Comparator<Student> getStudentNameComparatorWithNullsFirst() {
        return Comparator.nullsFirst(getStudentNameComparator());
    }
}
