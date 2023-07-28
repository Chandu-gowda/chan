import java.util.Scanner;

public class constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        class Person {
            String name;
            int age;

            //Constructor
            public Person(String NAME, int AGE) {
                this.name = NAME;
                this.age = AGE;
            }
        }
        //creating an object and calling the constructor 
        Person p1 = new Person("CHANDANA", 20);
        Person p2 = new Person("PAVAN", 25);
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p2.name);
        System.out.println(p2.age);

    }
}

