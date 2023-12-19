import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);

        // Вводим текущий курс доллара
        System.out.print("Введите текущий курс доллара: ");
        double exchangeRate = scanner.nextDouble();

        // Вводим количество рублей
        System.out.print("Введите количество рублей: ");
        double rubles = scanner.nextDouble();

        // Вычисляем итоговую сумму в долларах
        double dollars = rubles / exchangeRate;

        // Округляем итоговое значение до двух знаков после запятой
        dollars = Math.round(dollars * 100.0) / 100.0;

        // Выводим результат
        System.out.println("Итого: " + dollars + " долларов");

    }
}

