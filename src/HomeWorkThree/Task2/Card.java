package HomeWorkThree.Task2;

public class Card {
    int balance;
    String cardName;
    String numId;

    public Card (int bal, String name, String num){
        this.balance=bal;
        this.cardName=name;
        this.numId=num;
    }

    public void getCardInformation(){
        System.out.println("balance="+balance+", "+"CardName="+cardName+", "+"CardNumberId="+numId+".");
    }
}