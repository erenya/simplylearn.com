package threads;


public class CreateThread extends Thread {
	  public static void main(String[] args) {
		  
		  CreateThread thread = new CreateThread();
	    thread.start();
	    System.out.println("This code is outside of the thread");
	  }
	  public void run() {
	    System.out.println("This code is running in a thread");
	  }
	}