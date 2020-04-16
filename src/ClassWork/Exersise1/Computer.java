package ClassWork.Exersise1;


import java.util.Scanner;

public class Computer {

    public boolean isUsbDriveExist;

    void writeToUsbDrive(UsbDrive flash) {
        if (flash != null) {
            flash.setType(DataType.valueOf(
                    getDataFromKeyboard("Введите тип данных: ").toUpperCase()));
            flash.setData(getDataFromKeyboard("Введите данные: "));
        }
    }

    void printFromUsbDrive(UsbDrive flash) {
        if (flash != null) {
            switch (flash.getType()) {
                case MOVIE: {
                    System.out.println("Воспроизводится фильм " + flash.getData());
                    break;
                }
                case AUDIO: {
                    System.out.println("Играет песня " + flash.getData());
                    break;
                }
                case FILE: {
                    System.out.println("Файл: " + flash.getData());
                    break;
                }
            }
        }
    }

    public String getDataFromKeyboard(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public class USBInterface {

        public void putInInterfaceDrive(){
            Computer.this.isUsbDriveExist = true;
        }

        public void putOutInterfaceDrive(){
            Computer.this.isUsbDriveExist = false;
        }
    }
}
