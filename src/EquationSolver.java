import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим уравнение
        System.out.print("Введите уравнение: ");
        String equation = scanner.nextLine();

        //Разбиваем уравнение на компаненты
        char s1 = equation.charAt(0);
        char operator = equation.charAt(1);
        char s3 = equation.charAt(2);
        char s5 = equation.charAt(4);

        int x = 0;

        // Решаем уравнение в зависимости от положения неизвестного x и символа '+' или '-'
        if (s1 == 'x') {
            if (operator == '+') {
                x = Character.getNumericValue(s5) - Character.getNumericValue(s3);
            } else if (operator == '-') {
                x = Character.getNumericValue(s5) + Character.getNumericValue(s3);
            }
        } else if (s3 == 'x') {
            if (operator == '+') {
                x = Character.getNumericValue(s5) - Character.getNumericValue(s1);
            } else if (operator == '-') {
                x = Character.getNumericValue(s5) + Character.getNumericValue(s1);
            }
        } else if (s5 == 'x') {
            if (operator == '+') {
                x = Character.getNumericValue(s1) + Character.getNumericValue(s3);
            } else if (operator == '-') {
                x = Character.getNumericValue(s1) - Character.getNumericValue(s3);
            }
        }
        // Выводим значение x
        System.out.println("X = " +x);
    }
}