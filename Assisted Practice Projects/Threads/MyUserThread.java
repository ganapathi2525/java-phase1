package threads;

public class MyUserThread extends Thread {
	public void run()
 	{
  		System.out.println("Welcome to Threads session");
 	}
 public static void main( String args[] )
 	{
  		MyUserThread obj = new  MyUserThread();
  		obj.start();
 	}

}
