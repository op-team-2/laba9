import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 21);
        Person person2 = new Person("Alice", 25);
        Person person3 = new Person("Bob", 18);
        Person person4 = new Person("Andrey", 19);
        Person person5 = new Person("Oleg", 20);

        Student student1 = new Student("David", 20, "123");
        Student student2 = new Student("Eva", 19, "456");
        Student student3 = new Student("Cat", 22, "789");
        Student student4 = new Student("Danya", 19, "456");
        Student student5 = new Student("Kirill", 22, "789");

        Person[] people = {person1, person2, person3, person4, person5};
        Student[] students = {student1, student2, student3, student4, student5};

        Arrays.sort(people, ComparatorUtils.getPersonNameComparator());
        System.out.println("People sorted by name:");
        for (Person person : people) {
            System.out.println(person);
        }

        Arrays.sort(people, ComparatorUtils.getPersonAgeComparator());
        System.out.println("\nPeople sorted by age:");
        for (Person person : people) {
            System.out.println(person);
        }

        Arrays.sort(people, ComparatorUtils.getReversedPersonNameComparator());
        System.out.println("\nPeople sorted by name reverse");
        for (Person person : people) {
            System.out.println(person);
        }

        Arrays.sort(students, ComparatorUtils.getReversedStudentAgeComparator());
        System.out.println("\nStudents sorted by age reverse:");
        for (Student student : students) {
            System.out.println(student);
        }

        Arrays.sort(people, ComparatorUtils.getPersonNameThenAgeComparator());
        System.out.println("\nPeople sorted by name/age:");
        for (Person person : people) {
            System.out.println(person);
        }

        Arrays.sort(people, ComparatorUtils.getPersonNameComparatorWithNullsFirst());
        System.out.println("People name with nulls first:");
        for (Person person : people) {
            System.out.println(person);
        }

        Arrays.sort(students, ComparatorUtils.getStudentNameComparatorWithNullsFirst());
        System.out.println("\nName with nulls first:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
