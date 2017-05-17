package thread;

/** java中的sleep()和wait()的區別 */
public class SleepAndWaitDifference {

	 public static void main(String[] args) {
	        new Thread(new Thread1()).start();
	        try {
	             Thread.sleep(5000);
	         } catch (Exception e) {
	            e.printStackTrace();
	        }
	        new Thread(new Thread2()).start();
	    }

	    private static class Thread1 implements Runnable{
	        @Override
	        public void run(){
	            synchronized (SleepAndWaitDifference.class) {
	             System.out.println("enter thread1...");    
	             System.out.println("thread1 is waiting...");
	            try {
	            //調用wait()方法，線程會放棄對象鎖，進入等待此對象的等待鎖定池
	                SleepAndWaitDifference.class.wait();
	             } catch (Exception e) {
	                e.printStackTrace();
	            }
	             System.out.println("thread1 is going on ....");
	             System.out.println("thread1 is over!!!");
	            }
	        }
	    }

	    private static class Thread2 implements Runnable{
	        @Override
	        public void run(){
	            synchronized (SleepAndWaitDifference.class) {
	                 System.out.println("enter thread2....");
	                 System.out.println("thread2 is sleep....");
	                //只有針對此對象調用notify()方法後本線程才進入對象鎖定池準備獲取對象鎖進入運行狀態。
	                 SleepAndWaitDifference.class.notify();
	                //==================
	                //區別
	                //如果我們把代碼：TestD.class.notify();給註釋掉，即TestD.class調用了wait()方法，但是沒有調用notify()
	                //方法，則線程永遠處於掛起狀態。
	                try {
	                //sleep()方法導致了程序暫停執行指定的時間，讓出cpu該其他線程，
	                //但是他的監控狀態依然保持者，當指定的時間到了又會自動恢復運行狀態。
	                //在調用sleep()方法的過程中，線程不會釋放對象鎖。
	                     Thread.sleep(5000);
	                 } catch (Exception e) {
	                    e.printStackTrace();
	                }
	                 System.out.println("thread2 is going on....");
	                 System.out.println("thread2 is over!!!");
	            }
	        }
	    }
	 }
