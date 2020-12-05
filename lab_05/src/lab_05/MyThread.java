package lab_05;

public abstract class MyThread extends Thread{
	protected Bridge bridge;
	protected int time;
	static protected boolean run = false;
	
	public static void setRun(boolean r) {
		run = r;
	}
	public static boolean getRun() {
		return run;
	}
	public MyThread(String name, int time, Bridge bridge) {
		super(name);
		this.time = time;
		this.bridge = bridge;
	}
}
