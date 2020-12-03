package lab_05;

public class Bridge {
	private boolean isInUse = false;
	
	public synchronized void drive(Vehicle vehicle) {
		while (isInUse == true)        
	 		try {
	 			wait();         
	 		} catch (InterruptedException e) {  
	 			System.err.println("Przerwano watek");
	 		  }	
		isInUse = true;
		vehicle.drive();
		isInUse = false;
		notify();
	}
	public synchronized void swim(Barge barge) {
		while (isInUse == true)        
	 		try {
	 			wait();         
	 		} catch (InterruptedException e) {  
	 			System.err.println("Przerwano watek");
	 		  }
		isInUse = true;
		barge.swim();
		isInUse = false;
		notify();
	}
}
