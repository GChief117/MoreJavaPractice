/**
 * 
 */
package Part2;

/**
 * @author gunnar_beck7
 *
 */
public class ThisTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleTime time = new SimpleTime(15,30,19);
		//make build string to invoke and create a new series of strings 
		//using the this.method 
		System.out.println(time.buildString());
	}
}
	
	
	
	class SimpleTime{
		private int hour;
		private int minute;
		private int second;
		
		
		
		
		public SimpleTime(int hour, int minute, int second) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
			
			
			//we use this. to call upon our method we created
		
		//you can create a method
		//then you can construct it
		
		//methods are algorhtms
		//with beignning, middle, and end,
		//there is something generic already being returned
		//therefore, will be good to create your own method you are returning
		
			public String buildString() {
				return String.format("%24s: %s\n%24s: %s", 
						"this.toUniversalString()", 
						this.toUniversalString(),
						"toUniversalString()", toUniversalString());
				
			
			}
			
			//give the 24 hour convert time
			//this is not required since there ar eno local variables, as the instance variables
			public String toUniversalString() {
				return String.format("%02d:%02d:%02d", this.hour, 
						this.minute, this.second);
				
			}
			
			
			
		}
		


