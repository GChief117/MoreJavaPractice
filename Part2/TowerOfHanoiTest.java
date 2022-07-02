package Part2;

public class TowerOfHanoiTest {

	public static void main(String[] args) {
		int startPeg = 1;
		int endPeg = 3;
		int tempPeg = 2;
		int disks = 3;
		
		ToweresOfHanoi towersOfHanoi = new ToweresOfHanoi(disks);
		
		
		//inital nnrecursive call: move all disks
		towersOfHanoi.solveTowers(disks, startPeg, endPeg, tempPeg);
		

	}

}
