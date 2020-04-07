package HomeWorkThree.Task2;

public class DebetCard extends PlasticCard {
    String companyName;

    public DebetCard(int bal, String name, String num, String colour, boolean chip,String company){
        super(bal,name,num,colour,chip);
        this.companyName=company;
    }
    public void getCardInformation(){
        System.out.println("balance="+balance+", "+"CardName="+cardName+", "+"CardNumberId="+numId+", "+"ColourCard="+colourCard+", "+"Chip="+withChip+", "+"CompanyName="+companyName+".");
    }
}
