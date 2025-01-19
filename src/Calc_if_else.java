import java.util.Scanner;

public class Calc_if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення двох чисел
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Введення операції
        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;

        // Виконання операції за допомогою if/else
        if (operation == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operation == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operation == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operation == '/') {
            // Перевірка на ділення на нуль
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Error: Invalid operation.");
        }

        scanner.close();
    }
}