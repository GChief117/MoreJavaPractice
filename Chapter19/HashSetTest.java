package Chapter19;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class HashSetTest {

	private static final String colors[] = { "red", "red", "green", "green", "blue", "yellow" };

	public HashSetTest() {
		List<String> list = Arrays.asList(colors);
		System.out.printf("ArrayList: %s\n", list);
		printNonDuplicates(list);

	}
	
	
	//in this method we have our HashSet filter out all the duplicates
	private void printNonDuplicates(Collection<String> collection) {

		HashSet<String> set = new HashSet<String>(collection);

		System.out.println("\nNonduplicates are: ");

		for (String s : set)
			System.out.printf("%s ", s);

		System.out.println();
	}

	public static void main(String[] args) {

		new HashSetTest();
	}

}
