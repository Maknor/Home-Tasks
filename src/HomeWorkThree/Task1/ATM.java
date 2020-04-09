package HomeWorkThree.Task1;

import java.util.Scanner;

public class ATM {

    private int countBillTwenty;
    private int countBillFifty;
    private int countBillOneHundred;

    public ATM() {
    }

    public ATM(int countBillTwenty, int countBillFifty, int countBillOneHundred) {
        this.countBillTwenty = countBillTwenty;
        this.countBillFifty = countBillFifty;
        this.countBillOneHundred = countBillOneHundred;
    }

    public void replenishmentATM () {
        int countsBillTwenty;
        int countsBillFifty;
        int countsBillOneHundred;
        System.out.println("Введите кол-во купюр на которое пополняется банкомат:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Купюры номиналом 20:");
        countsBillTwenty = scan.nextInt();
        System.out.println("Купюры номиналом 50:");
        countsBillFifty = scan.nextInt();
        System.out.println("Купюры номиналом 100:");
        countsBillOneHundred = scan.nextInt();
        addMoney(countsBillTwenty, countsBillFifty, countsBillOneHundred);
    }

    public void addMoney (int countBillTwenty, int countBillFifty, int countBillOneHundred) {
        addBillTwenty(countBillTwenty);
        addBillFifty(countBillFifty);
        addBillOneHundred(countBillOneHundred);
    }

    public void addMoney (int countBillTwenty, int countBillFifty) {
        addBillTwenty(countBillTwenty);
        addBillFifty(countBillFifty);
    }

    public void addBillTwenty (int countBillTwenty) {
        this.countBillTwenty += countBillTwenty;
    }

    public void addBillFifty (int countBillFifty) {
        this.countBillFifty += countBillFifty;
    }

    public void addBillOneHundred (int countBillOneHundred) {
        this.countBillOneHundred += countBillOneHundred;
    }

    public boolean withdrawMoney (int withdrawalAmount) {
        boolean result;
        int possibleAmount = withdrawalAmount;
        int countsBillTwenty = 0;
        int countsBillFifty = 0;
        int countsBillOneHundred = 0;
        int sum = 100 * countBillOneHundred + 50 * countBillFifty + 20 * countBillTwenty;
        if (withdrawalAmount % 10 == 0 && sum >= withdrawalAmount && withdrawalAmount >= 20 && withdrawalAmount != 30) {
            countsBillOneHundred = countBill(possibleAmount, 100);
            possibleAmount -= countsBillOneHundred * 100;
            countsBillFifty = countBill(possibleAmount, 50);
            possibleAmount -= countsBillFifty * 50;
            if (possibleAmount % 20 != 0 ) {
                if (countsBillFifty > 0) {
                    possibleAmount += 50;
                    countsBillFifty--;
                } else if (countsBillOneHundred > 0) {
                    possibleAmount += 100 - 50;
                    countsBillOneHundred--;
                    countsBillFifty++;
                }
            }
            countsBillTwenty = countBill(possibleAmount, 20);
            possibleAmount -= countsBillTwenty * 20;
            result = possibleAmount == 0;
        }
        else
            result = false;
        if (result)
            withdrawalResult(withdrawalAmount, countsBillTwenty, countsBillFifty, countsBillOneHundred);
        return result;
    }

    private int countBill (int amount, int bill) {
        int count = amount / bill;
        int quantity = 0;
        switch (bill) {
            case 20:
                quantity = countBillTwenty;
                break;
            case 50:
                quantity = countBillFifty;
                break;
            case 100:
                quantity = countBillOneHundred;
                break;
        }
        if (count > quantity)
            count = quantity;
        return count;
    }

    private void withdrawalResult(int withdrawalAmount, int countsBillTwenty, int countsBillFifty, int countsBillOneHundred) {
        System.out.println("Сумма " + withdrawalAmount + " будет выдана следующими купюрами:");
        if (countsBillOneHundred > 0)
            System.out.println("Купюры номиналом 100 - " + countsBillOneHundred + " штук");
        if (countsBillFifty > 0)
            System.out.println("Купюры номиналом 50 - " + countsBillFifty + " штук");
        if (countsBillTwenty > 0)
            System.out.println("Купюры номиналом 20 - " + countsBillTwenty + " штук");
        countBillOneHundred -= countsBillOneHundred;
        countBillFifty -= countsBillFifty;
        countBillTwenty -= countsBillTwenty;
    }

    public void printOfRemainingBills() {
        System.out.println("В банкомате осталось:");
        System.out.println("Купюры номиналом 20 - " + countBillTwenty + " штук");
        System.out.println("Купюры номиналом 50 - " + countBillFifty + " штук");
        System.out.println("Купюры номиналом 100 - " + countBillOneHundred + " штук");
    }
}
