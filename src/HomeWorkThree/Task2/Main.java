package HomeWorkThree.Task2;

public class Main {
    public static void main(String[] args) {
        Card card = new Card(1000,"SimpleCard","123");
        card.getCardInformation();
        VirtualCard card2 = new VirtualCard(1500,"VirtualCard","1234","Human","4239");
        card2.getCardInformation();
        PlasticCard card3 = new PlasticCard(1800,"PlasticCard","12345","Black",true);
        card3.getCardInformation();
        DebetCard card4 = new DebetCard(2000,"DebetCard","123456","Red",false,"MyIt");
        card4.getCardInformation();
        CreditCard card5 = new CreditCard(2500,"CreditCard","1234567","Green",true,2500);
        card5.getCardInformation();
        MasterCard card6 = new MasterCard(5000,"MasterCard","12345678","Black-Blue",true,10000,"Artom Dzuba", "BTA Bank");
        card6.getCardInformation();
    }
}
