/**
 * 
 */
package Part2;

/**
 * @author gunnar_beck7
 *
 */
public class ToweresOfHanoi {

	int numD;

	public ToweresOfHanoi(int disks) {
		numD = disks;
	}
	
	
	public void solveTowers(int disks, int sourcePeg, int destinationPeg, int tempPeg) {
		
		//base-case only one disk to move
		//recursivelly we do if else
		if(disks == 1) {
			System.out.printf("\n%d --> %d", sourcePeg, destinationPeg);
			return;
		}
		
		
		//recursion step 1
		//using n -1, disks from source peg
		solveTowers(disks - 1, sourcePeg, tempPeg, destinationPeg);
		
		
		//moving the last disk from source peg to desintaiton peg
		System.out.printf("\n%d --> %d", sourcePeg, destinationPeg);

		
		//move (disk -1 ) disks from tempPeg to desitnationPeg
		solveTowers(disks - 1, sourcePeg, tempPeg, destinationPeg);

		
	}

}
