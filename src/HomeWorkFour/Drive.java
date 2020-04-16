package HomeWorkFour;

public interface Drive {

    boolean write(String type, String data);

    boolean read();

    void putOn();

    void putOff();
}