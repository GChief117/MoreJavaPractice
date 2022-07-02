package Part2;

public class TimeTest {

	public static void main(String[] args) {
		
		
		Time time = new Time();
		
		
		System.out.print( "The initial universal time is: " );
		System.out.println(time.toUniversalString());
		System.out.print( "The initial standard time is: " );
		System.out.println(time.toString());
		System.out.println();
		
		//there are already private local parameteres set 
		//where when you call the method
		//they will automatically generate (0,0,0)
		time.setTime(13, 27, 6);
		System.out.print("Universal time after setTime is: ");
		System.out.println(time.toUniversalString());
		System.out.print("Standard time after setTime is: ");
		System.out.println(time.toString());
		System.out.println();
		
		
		//there are already private local parameteres set 
		//where when you call the method
		//they will automatically generate (0,0,0)
		time.setTime(99, 99, 99);
		System.out.println("After attemtpting invalid settings: ");
		System.out.print("Universal time: ");
		System.out.println(time.toUniversalString());
		System.out.print("Standard time: ");
		System.out.println(time.toString());


	}

}
