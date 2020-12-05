package lab_05;


public class Barge extends MyThread{
	private int position; //0-WEST, 1-EAST
	private int place;
	private Frame frame;
	public Barge(String name, int time, Bridge bridge, int position, Frame frame, int place) {
		super(name, time, bridge);
		this.place = place;
		this.frame = frame;
		if (position == 0 || position == 1){
		}
		else {
			throw new IllegalArgumentException("Illegal position");
		}
		frame.setText(this.getPosition()*4+8+this.getPlace(), this.getName());
	}
	public int getPlace() {
		return place;
	}
	public void setPlace(int place) {
		this.place = place;
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
	
	public void swim() {
		frame.setText(this.getPosition()*4+8+this.getPlace(), "-");
		frame.setText(17, this.getName());
		if (this.getPosition() == 0){
			this.setPosition(1);
		}
		else {
			this.setPosition(0);
		}
		try{
  			sleep(time+(int)(Math.random()*100));
  			} catch(InterruptedException e) {
  				System.err.println("Przerwano watek");
  			  }
		frame.setText(17, "[ ]");
	}
	
	public void run() {  
		int place = 0;
    	while (run) {        
      		try{
      			sleep(time+(int)(Math.random()*100));
      			} catch(InterruptedException e) {
      				System.err.println("Przerwano watek");
      			  }
      		this.setName(this.getName().toUpperCase());
    		frame.setText(this.getPosition()*4+8+this.getPlace(), this.getName());
			bridge.swim(this, place);
      		try{ 
      			sleep(time+(int)(Math.random()*100));
      			} catch(InterruptedException e) {
      				System.err.println("Przerwano watek");
      			  }
   		}
	}
}
