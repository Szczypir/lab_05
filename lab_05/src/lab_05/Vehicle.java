package lab_05;

public class Vehicle extends MyThread{
	private int position; //0-NORTH, 1-SOUTH

	public Vehicle(String name, int time, Bridge bridge, int position) {
		super(name, time, bridge);
		if (position == 0 || position == 1){
			this.position = position;
		}
		else {
			throw new IllegalArgumentException("Illegal position");
		}
	}
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		if (position == 0 || position == 1){
			this.position = position;
		}
		else {
			throw new IllegalArgumentException("Illegal position");
		}
	}
	
	public void drive() {
		if (this.getPosition() == 0){
			this.setPosition(1);
		}
		else {
			this.setPosition(0);
		}
	}
	
	public void run() {                  
    	while (run) {        
      		try{ 
      			sleep(time+(int)(Math.random()*100));
      			} catch(InterruptedException e) {
      				System.err.println("Przerwano watek");
      			  }
			bridge.drive(this);
			System.out.println(this.getName()+" is now in "+this.getPosition());
      		try{ 
      			sleep(time+(int)(Math.random()*100));
      			} catch(InterruptedException e) {
      				System.err.println("Przerwano watek");
      			  }
   		}
	}
}
