package ClassWork.Exersise1;

public class App {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer.USBInterface usb = computer.new USBInterface();
        UsbDrive drive = new UsbDrive();

        usb.putInInterfaceDrive();
        if (computer.isUsbDriveExist){
            computer.writeToUsbDrive(drive);
            computer.printFromUsbDrive(drive);
        } else {
            System.out.println("флешки нет!");
        }
    }
}
