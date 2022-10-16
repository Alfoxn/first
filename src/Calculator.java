import java.util.Scanner;

class Calculator {
    int num1;
    int num2;


    Calculator() {
    }

    void Num1() {
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
    }

    void Num2() {
        Scanner scanner = new Scanner(System.in);
        num2 = scanner.nextInt();

    }

    void SUM() {
        System.out.println(num1 + num2);
    }

    void DIFF() {
        System.out.println(num1 - num2);
    }

    void MUL() {
        System.out.println(num1 * num2);
    }

    void DIV() {
        System.out.println(num1 / num2);
    }
}