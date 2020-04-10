package ClassWork.Exersise2;

public class Potato implements State{

    public boolean friedNo(){
        System.out.println("Картошка еще сырая.");
        return false;
    }

    public boolean friedIn() {
        System.out.println("Картошка жарится.");
        return true;
    }

    public boolean friedYes() {
        System.out.println("Картошка уже пожарена.");
        return true;
    }
}
