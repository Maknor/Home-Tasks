package ClassWork.Exersise1;


import java.util.Scanner;

public class Computer {

    public boolean isUsbDriveExist;

    void printFromUsbDrive(UsbDrive flash) {
        System.out.println(flash.data);
        switch (flash.type) {
            case MOVIE: {
                System.out.println("Воспроизводится фильм Титаник");
                break;
            }
            case AUDIO: {
                System.out.println("Воспроизводится аудио Урок1");
                break;
            }
            case FILE: {
                System.out.println("Открывается файл с текстом");
                break;
            }
        }
    }
    void writeToUsbDrive(UsbDrive flash) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        flash.data = str;
        //flash.setType(DataType.valueOf("MOVIE"))
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
