package interfaceExercise;

public class Phone implements USB , WiFi{

	@Override
	public void open() {
		System.out.println("WiFi open");
		
	}

	@Override
	public void close() {
		System.out.println("WiFi close");
		
	}

	@Override
	public void read() {
		System.out.println("USB read");
		
	}

	@Override
	public void write() {
		System.out.println("USB write");
		
	}
	
}
