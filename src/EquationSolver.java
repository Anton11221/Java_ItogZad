import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим уравнение
        System.out.print("Введите уравнение: ");
        String equation = scanner.nextLine();

        // Извлекаем неизвестное и числа из уравнения
        char unknown = equation.charAt(0);
        char operator = equation.charAt(1);
        int number1 = Character.getNumericValue(equation.charAt(2));
        int number2 = Character.getNumericValue(equation.charAt(4));

        // Вычисляем значение неизвестного
        int result;
        if (operator == '+') {
            result = number2 - number1;
        } else {
            result = number1 - number2;
        }
        System.out.println("Неизвестное x равно " + result);

    }
}