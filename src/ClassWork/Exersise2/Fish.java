package ClassWork.Exersise2;

public class Fish implements State{

    public boolean friedNo(){
        System.out.println("Рыба еще сырая.");
        return false;
    }

    public boolean friedIn() {
        System.out.println("Рыба жарится.");
        return true;
    }

    public boolean friedYes() {
        System.out.println("Рыба уже пожарена.");
        return true;
    }
}
