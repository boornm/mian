import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

//        Scanner sc = new Scanner(System.in);

//        for (int i = 0; i < 2; i++){
//            String s1 = sc.next(); String s2 = sc.next(); String s3 = sc.next();
//
//            int a = sc.nextInt();
//
//            persons.add(new Employee(s1, s2, s3, a));
//
//            s1 = sc.next(); s2 = sc.next();
//
//            double b = sc.nextDouble();
//
//            persons.add(new Student(s1, s2, b));
//        }

        persons.add(new Student("Jhon", "Legend", 3.67));
        persons.add(new Employee("Sean", "Leon", "Boss", 75000));
        persons.add(new Student("YE", "West", 2));
        persons.add(new Employee("Hndrxx", "Future", "Producer", 105000));

        for (int i = 0; i < 4; i++){
            persons.get(i).getPaymentAmount();
        }

        printData(persons);
    }
    public static void printData(ArrayList<Person> persons){
        for (Person person : persons){
            System.out.println(person.ToString() + " " + person.getPaymentAmount());
        }
    }
}
