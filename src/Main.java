import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Human person1 = new Human("Alise", "Skv", "S", 26);
//        Human person2 = new Human();
//        System.out.println(person1.name);
//        person1.setName("Alex");
//        System.out.println(person1.getName());
//        person1.setSurname("S");
//        System.out.println(person1);
//        System.out.println(person2);
//
        Calculator one = new Calculator();
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        one.sum(num1, num2);


    }


}
