package class_Object;

import java.util.Scanner;

class Person {
    String name;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        String name2 = input.nextLine();

        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = name1;
        person2.name = name2;

        System.out.println(person1.name);
        System.out.println((person2.name));

        input.close();
    }
}
