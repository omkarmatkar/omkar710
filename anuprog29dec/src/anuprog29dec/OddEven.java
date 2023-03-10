package anuprog29dec;

public class OddEven implements
Runnable {
	
	    private int number;

	    public OddEven (int number) {
	        this.number = number;
	    }

	    @Override
	    public void run() 
	    {
	        if (number % 2 == 0) {
	            System.out.println(number + " is an even number.");
	        } else {
	            System.out.println(number + " is an odd number.");
	        }
	    }
	    public static void main(String[] args)
	    {
	    	
	        Thread t1 = new Thread (new OddEven(3));
	        t1.start();

	        Thread t2 = new Thread (new OddEven(2));
	        t2.start();
	    }
}


