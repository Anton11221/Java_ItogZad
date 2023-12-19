import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вводим число строк
        System.out.print("Количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        //Создаем строковую и числовую переменные
        String maxUniqueCharsString = "";
        int maxUniqueCharsCount = 0;

        //Цикл создания и обработки строк
        for (int i = 0; i < n; i++) {
            //Вводим строку
            System.out.print("Строка " + (i+1) + ": ");
            String input = scanner.nextLine();

            //Вызываем счетчик уникальных символов, записываем результат в переменную
            int uniqueCharsCount = countUniqueChars(input);

            //Проверяем, является ли строка, строкой с мах числом уникальных символов
            if (uniqueCharsCount > maxUniqueCharsCount) {
                //Если Да, обновляем значение числовой и строковой переменных
                maxUniqueCharsCount = uniqueCharsCount;
                maxUniqueCharsString = input;
            }
        }
        //Выводим результат
        System.out.println("Ответ: " + maxUniqueCharsString);
    }
    //Создаем внутренний метод, считающий число уникальных символов в строке

    private static int countUniqueChars(String str) {
        // Создается пустое множество для хранения уникальных символов.
        Set<Character> uniqueChars = new HashSet<>();

        // Перебираем все символы в строке, добавляем каждый уникальный символ в множество.
        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }
        // Выводим количество уникальных символов в строке
        return uniqueChars.size();
    }
}