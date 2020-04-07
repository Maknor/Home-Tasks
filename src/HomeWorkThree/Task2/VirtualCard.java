package HomeWorkThree.Task2;

import HomeWorkThree.Task2.Card;

public class VirtualCard extends Card {
    String virtualAccount;
    String pinCode;

    public VirtualCard(int bal, String name, String num, String virtualAcc, String pin){
        super(bal,name,num);
        this.virtualAccount=virtualAcc;
        this.pinCode=pin;
    }

    public void getCardInformation(){
        System.out.println("balance="+balance+", "+"CardName="+cardName+", "+"CardNumberId="+numId+", "+"VirtualAccount="+virtualAccount+", "+"PinCode="+pinCode+".");
    }
}
