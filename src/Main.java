

public class Main {
    public static void main(String[] args) {
        Human person1 = new Human("Alise", "Skv", "S", 26);
        Human person2 = new Human();
        System.out.println(person1.name);
        person1.setName("Alex");
        System.out.println(person1.getName());
        person1.setSurname("S");
        System.out.println(person1);
        System.out.println(person2);

        Calculator one = new Calculator();
        one.Num1();
        one.Num2();
        one.SUM();


    }


}
