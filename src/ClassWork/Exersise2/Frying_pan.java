package ClassWork.Exersise2;

public class Frying_pan {

    public State states[];

    public Frying_pan(State[] states) {
        this.states = states;
    }

    public void friedNoAllFood() {
        for (int i = 0; i < states.length; i++) {
            states[i].friedNo();
        }
    }

    public void friedInAllFood() {
        for (int i = 0; i < states.length; i++) {
            states[i].friedIn();
        }
    }

    public void friedYesAllFood() {
        for (int i = 0; i < states.length; i++) {
            states[i].friedYes();
        }
    }

    public static void main(String[] args) {
        State states[] = new State[3];
        states[0] = new Chicken();
        states[1] = new Fish();
        states[2] = new Potato();

        Frying_pan Tefal = new Frying_pan(states);
        Tefal.friedNoAllFood();
        Tefal.friedInAllFood();
        Tefal.friedYesAllFood();
    }
}
