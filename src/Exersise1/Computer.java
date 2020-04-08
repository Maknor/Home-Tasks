package Exersise1;


import java.util.Scanner;

public class Computer {

    public boolean isUsbDriveExist;

    void printFromUsbDrive(UsbDrive flash) {
        System.out.println(flash.data);
    }
    void writeToUsbDrive(UsbDrive flash) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        flash.data = str;
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
