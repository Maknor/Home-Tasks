package HomeWorkTwo;

import java.util.Scanner;

public class GamePoker {

    int cardsPerPlayer = 5;
    int players = 0 ;
    String[] suits = {"♠","♦","♥","♣"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    int n = suits.length * rank.length;
    // часть 1 - ввод с консоли
    public GamePoker() {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество игроков: ");

            if (scanner.hasNextInt()) {
                players = scanner.nextInt();
                if (cardsPerPlayer * players <= n && cardsPerPlayer * players > 0) {
                    break;
                } else {
                    if (players <= 0) {
                        System.out.println("Введите положительное количество игроков!");
                        continue;
                    } else {
                        System.out.println("Слишком много игроков, карт недостаточно!");
                        continue;
                    }
                }
            } else {
                System.out.println("Вы ввели не число, повторите попытку!");
                continue;
            }
        }
        // часть 2 - инициализация колоды
        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }
        // часть 3 - перетасовка колоды
        for (int i = 0; i < n; i++) {
            int rand = i + (int) (Math.random() * (n - i)); // случайная карта в колоде
            String temp = deck[rand];
            deck[rand] = deck[i];
            deck[i] = temp;
        }
        // часть 4 - перетасованная колода выводится на экран
        for (int i = 0; i < players * cardsPerPlayer; i++) {
            System.out.println(deck[i]);
            if (i % cardsPerPlayer == cardsPerPlayer - 1) {
                System.out.println();
            }
        }
    }
}
