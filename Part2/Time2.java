package Part2;

public class Time2 {
	private int hour; //0-23
	private int minute; //0-59
	private int second;//0-59
	
	
	//defailt constructor
	public Time2() {
		this(0,0,0); //three integer values
	}
	
	public Time2 (int h) {
		this(h,0,0);
	}
	
	
	public Time2 (int h, int m) {
		this(h,m,0);
	}
	
	//method being invooked in the inital constructor 
	//this(method) 
	public Time2(int h, int m, int s) {
		setTime(h,m,s);
	}
	
	

	
	
	
	//gets have a varaible in beginning
	//and return 
	public Time2(Time2 time) {
		this(time.getHour(), 
			time.getMinute(), 
			time.getSecond());
	}

	public int getSecond() {
		
		return second; 
	}

	public int getMinute() {

		return minute;
	}

	public int getHour() {  
		return hour;
	}
	
	
	//set has void because they are conditions
	//and they dont return anything
	//set has coniditons
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);		
	}

	public void setSecond(int s) { //set uses void
		second = ((s >= 0 && s < 60) ? s : 0);
	}

	public void setMinute(int m) {
		minute = ((m >= 0 && m < 60) ? m : 0);
	}

	public void setHour(int h) {
		hour = ((h >= 0 && h < 24) ? h : 0);
	}
	
	
	
	//you put set first 
	
	
	//you ultimately call the get methods for your string formats
	//can also do this.getHour(), this.getMinute(), this.getSecond()
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	
	//to string format
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : 
			getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}

}
