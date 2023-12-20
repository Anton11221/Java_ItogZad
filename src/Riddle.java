import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tries = 3; // количество попыток
        boolean hint = false; // использована ли подсказка

        System.out.println("Отгадай загадку!");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("У тебя есть три попытки и одна \"Подсказка\"");

        //Проверяем число оставшихся попыток, принимаем ответ
        while (tries > 0) {
            System.out.print("Ответ: ");
            String answer = scanner.nextLine();

            //Проверяем ответ, если совпал,- выводим Правильно
            if (answer.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
                break;
            //Проверяем ответ, запрошена ли подсказка
            } else if (answer.equalsIgnoreCase("Подсказка")) {
               // Усли запрошена подсказка, проверяем запрашивали ее раньше или нет.
                if (hint) {
                    //Если подсказка уже использована, выводим сообщение ниже
                    System.out.println("Подсказка уже недоступна");
                } else {
                    //Если подсказка не использована, выводим подсказку, счетчику присваиваем true
                    System.out.println("Тысячи компьютеров стоят на защите от него");
                    hint = true;
                }
            //Если ответ на вопрос не верный
            } else {
                //Проверяем число оставшихся попыток
                if (tries == 1) {
                    //Если попытки закончились
                    System.out.println("Обидно, приходи в другой раз");
                    break;
                //Если попытки остались
                } else {
                    System.out.println("Подумай еще!");
                }
                //Уменьшаем счетчик попыток на 1
                tries--;
            }
        }
    }
}