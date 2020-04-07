package HomeWorkThree.Task2;

import HomeWorkThree.Task2.Card;

public class PlasticCard extends Card {
    String colourCard;
    boolean withChip;

    public PlasticCard(int bal, String name, String num, String colour, boolean chip){
        super(bal,name,num);
        this.colourCard=colour;
        this.withChip=chip;
    }

    public void getCardInformation(){
        System.out.println("balance="+balance+", "+"CardName="+cardName+", "+"CardNumberId="+numId+", "+"ColourCard="+colourCard+", "+"Chip="+withChip+".");
    }
}