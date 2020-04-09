package HomeWorkThree.Task1;

import java.util.Scanner;

public class ATMWork {

    public static void main(String[] args) {
        ATM atm = new ATM(10,10,10);
        int MakeChoice;
        do {
            MakeChoice = menu();
            switch (MakeChoice) {
                case 1:
                    atm.replenishmentATM();
                    break;
                case 2:
                    System.out.println("Введите сумму для снятия:");
                    Scanner scanner = new Scanner(System.in);
                    if (!atm.withdrawMoney(scanner.nextInt()))
                        System.out.println("Данную сумму снять невозможно!");
                    break;
                case 3:
                    atm.printOfRemainingBills();
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
        System.out.println("1. Пополнить банкомат купюрами.");
        System.out.println("2. Снять деньги со счета.");
        System.out.println("3. Посмотреть сколько купюр осталось в банкомате.");
        System.out.println("4. Выход.");
        return scanner.nextInt();
    }
}
