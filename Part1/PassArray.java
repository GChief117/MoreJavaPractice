package Part1;

public class PassArray {

	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5,6};
		
		System.out.println("Effects of passing reference to entire array:\n" + 
		"The values of the original array are:" );
		
		
		for (int value : array)
			System.out.printf(" %d", value );
		
	
		modifyArray(array); //we are calling the modifyArray method
		System.out.println( "\n\nThe modified values of the array are:" );
		
		//output the modified arary of elements
		for (int value: array)
			System.out.printf( " %d", value );
	
		System.out.printf("\n\nEffects of passing array element value:\n" + 
		"array[3] before modifyElement: %d\n", array[ 3 ] );
		
		
		modifyElement( array[ 3 ] ); //attempt to modify array 3, which is 8 in this case since we have our orinal 
		//array of 1,2,3,4,5,6 and at position 3 we have 4, thne mulitpled by 2, 
		//which is then 8 and then we go back to our modifyElement method to see the 
		//value of the element which is to be modified by mulitplying it by 2, 
		System.out.printf("array[3] after modifyElement: %d\n", array[ 3 ]);
	}
	
	
	public static void modifyArray(int array2[]) { //when we pass in the second array in as a parameter
		for (int i = 0; i < array2.length; i++)
			array2[i] *= 2; //we are multipling each component in the array by 2
		//{2,4,6,8,10,12}
		
	}
	
	public static void modifyElement(int element) {
		element *= 2;
		System.out.printf( "Value of element in modifyElement: %d\n", element );
		
	}

}
