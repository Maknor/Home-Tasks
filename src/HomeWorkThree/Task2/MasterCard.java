package HomeWorkThree.Task2;

import HomeWorkThree.Task2.CreditCard;

public class MasterCard extends CreditCard {
    String cardHolderName;
    String bankName;

    public MasterCard(int bal, String name, String num, String colour, boolean chip, int accLim, String cardHolder, String bank){
        super(bal,name,num,colour,chip,accLim);
        this.cardHolderName=cardHolder;
        this.bankName=bank;
    }

    public void getCardInformation(){
        System.out.println("balance="+balance+", "+"CardName="+cardName+", "+"CardNumberId="+numId+", "+"ColourCard="+colourCard+", "+"Chip="+withChip+", "+"AccountLimit="+accountLimit+", "+"CardHolderName="+cardHolderName+", "+"BankName="+bankName+".");
    }
}
