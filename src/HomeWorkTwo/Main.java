/*
### Задача

Создать консольную программу с пунктами меню, которые будут выводить решения задач:
1. Таблица умножения - выводит таблицу умножения от 1 до 9
2. Подсчет символов - пользователю предлагается ввести текст и символ для поиска.
После этого на экран выводится количество символов в тексте
3. Покер - программа, которая имитирует раздачу карт для игры в покер.
Пользователю предлагается ввести число `n`. Программа раздает карты на `n` игроков (по 5 карт каждому) из рассортированной колоды.
Вывести карты всех игроков на экран.
4. Выход - программа завершается.

При выполнении заданий используйте отдельный класс для каждого пункта меню.
*/

package HomeWorkTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int MakeChoice;
        do {
            MakeChoice =  menu();
            switch (MakeChoice){
                case 1:
                    MultiplicationTable.Table();
                    break;
                case 2:
                    CountCharacters countcharacters = new CountCharacters();
                    countcharacters.symbolCount();
                    break;
                case 3:
                    GamePoker poker = new GamePoker();
                    break;
                case 4:
                    System.out.println("Благодарим Вас за выбор нашей программы!");
                    break;
                default:
                    System.out.println("Выбран неверный пункт меню! Пожалуйста, повторите ваш выбор.");
            }
        } while (MakeChoice != 4);
    }

    private static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите пункт меню:");
        System.out.println("1. Таблица умножения.");
        System.out.println("2. Подсчет символов.");
        System.out.println("3. Покер.");
        System.out.println("4. Выход.");
        return scanner.nextInt();
    }
}
