package HomeWorkTwo;

import java.util.Scanner;

public class CountCharacters {

    String text;
    char symbol;
    int count = 0;

    public void Text() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите текст для поиска:");
        text = scanner.nextLine();
    }

    public void Symbol() {
        Scanner scanner = new Scanner(System.in);
        String SymbolForSearch;
        boolean condition = true;
        do {
            System.out.println("Введите символ, который необходимо найти");
            SymbolForSearch = scanner.nextLine();
            if (SymbolForSearch.length() != 1) {
                System.out.println("Количество символов введено неверно! Пожалуйста, введите только один символ.");
            } else {
                symbol = SymbolForSearch.charAt(0);
                condition = false;
            }
        } while (condition);
    }

    public void CountCharactersInText() {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                count++;
            }
        }
    }

    public void symbolCount() {
        Text();
        Symbol();
        CountCharactersInText();
        System.out.println("В тексте найдено " + count + " символа(ов): " + "\"" + symbol + "\"");
    }
}

