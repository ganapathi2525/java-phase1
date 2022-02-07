package threads;

public class MyRunnableThread implements Runnable{
	public static int myCount = 0;
    public MyRunnableThread() {}
    public void run() {
        while(MyRunnableThread.myCount <= 5){
            try{
                System.out.println("Expl Thread: "+(++MyRunnableThread.myCount));
                Thread.sleep(1000);
            } catch (InterruptedException ret) {
                System.out.println("Exception in thread: "+ret.getMessage());
            }
        }
    } 
public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        MyRunnableThread obj = new MyRunnableThread();
        Thread t = new Thread(obj);
        t.start();
        while(MyRunnableThread.myCount <= 5){
            try{
                System.out.println("Main Thread: "+(++MyRunnableThread.myCount));
                Thread.sleep(1000);
            } catch (InterruptedException ret){
                System.out.println("Exception in main thread: "+ret.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }

}
