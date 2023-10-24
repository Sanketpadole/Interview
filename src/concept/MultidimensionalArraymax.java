package concept;

public class MultidimensionalArraymax {
	public static void main(String[] args) {
		int[][] myArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int max = myArray[0][0];

		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				if (myArray[i][j] > max) {
					max = myArray[i][j];
				}
			}
		}

		System.out.println("Maximum element in the array: " + max);

	}

}
