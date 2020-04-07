package HomeWorkThree.Task2;

public class CreditCard extends PlasticCard {
    int accountLimit;

    public CreditCard(int bal, String name, String num, String colour, boolean chip, int accLim){
        super(bal,name,num,colour,chip);
        this.accountLimit=accLim;
    }
    public void getCardInformation(){
        System.out.println("balance="+balance+", "+"CardName="+cardName+", "+"CardNumberId="+numId+", "+"ColourCard="+colourCard+", "+"Chip="+withChip+", "+"AccountLimit="+accountLimit+".");
    }
}
