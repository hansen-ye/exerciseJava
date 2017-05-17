package java7VSjava8;

public class LambdaTest1 {
	public static void main(String[] args) {
		System.out.println("Tset");
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world one!");
			}
		};
		
//		Runnable r2 = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Hello world two!");
//			}
//		};
		Runnable r2 = () ->System.out.println("Hello world two!");
		
		r1.run();
		r2.run();
	}
}