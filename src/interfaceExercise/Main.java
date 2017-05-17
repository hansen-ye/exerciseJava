package interfaceExercise;

public class Main {
	public static void main(String args[]){
		Phone phone = new Phone();
		
		USB usb = phone;
		usb.read();
		usb.write();
		
		WiFi wifi = phone;
		wifi.open();
		wifi.close();
		
	}
}
