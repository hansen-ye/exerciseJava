package thread;

//通過繼承 Thread 創建線程
class NewThreadOne extends Thread {
	NewThreadOne() {
		// 創建第二個新線程
		super("Demo Thread");
		System.out.println("Child thread: " + this);
		start(); // 開始線程
	}

	// 第二個線程入口
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				// 讓線程休眠一會
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}

public class ExtendThread {
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