package lab_05;

public class Bridge {
	private boolean isInUse = false;
	private Frame frame;
	public Bridge(Frame frame) {
		this.frame = frame;
	}
	public synchronized void drive(Vehicle vehicle, int place) {
		while (isInUse == true)        
	 		try {
	 			wait();         
	 		} catch (InterruptedException e) {  
	 			System.err.println("Przerwano watek");
	 		  }	
		isInUse = true;
		vehicle.drive();
		vehicle.setName(vehicle.getName().toLowerCase());
		frame.setText(vehicle.getPosition()*4+vehicle.getPlace(), vehicle.getName());
		frame.setText(Math.abs(vehicle.getPosition()-1)*4+vehicle.getPlace(), "-");
		isInUse = false;
		notify();
	}
	public synchronized void swim(Barge barge, int place) {
		while (isInUse == true) {
			try {
	 			wait();         
	 		} catch (InterruptedException e) {  
	 			System.err.println("Przerwano watek");
	 		  }
		}
		isInUse = true;
		barge.swim();
		barge.setName(barge.getName().toLowerCase());
		frame.setText(barge.getPosition()*4+8+barge.getPlace(), barge.getName());
		frame.setText(Math.abs(barge.getPosition()-1)*2+8+barge.getPlace(), "-");
		isInUse = false;
		notify();
	}
}
