package thread;

//創建一個新的線程
class NewThread implements Runnable {
	Thread t;

	NewThread() {
		// 創建第二個新線程
		t = new Thread(this,"Demo Thread");
		System.out.println("Child thread: " + t);
		t.start(); // 開始線程
	}


	// 第二個線程入口
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				// 暫停線程
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}

public class ImplementsRunnable {
	public static void main(String args[]) {
		new NewThread(); // 創建一個新線程
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting.");
	}
}
