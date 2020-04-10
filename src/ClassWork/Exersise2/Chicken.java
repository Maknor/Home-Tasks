package ClassWork.Exersise2;

public class Chicken implements State{

    public boolean friedNo(){
        System.out.println("Курица еще сырая.");
        return false;
    }

    public boolean friedIn() {
        System.out.println("Курица жарится.");
        return true;
    }

    public boolean friedYes() {
        System.out.println("Курица уже пожарена.");
        return true;
    }


}