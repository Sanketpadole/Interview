package concept;

public class Multidimensionalarray2 {
	public static void main(String[] args) {
		int[][] myArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;
		for (int i = 0; i < myArray.length; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				sum = sum + myArray[i] + myArray[j];
			}
		}

	}

}

//
//int[][] myArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//int sum = 0;
//
//for (int i = 0; i < myArray.length; i++) {
//	for (int j = 0; j < myArray[i].length; j++) {
//		sum += myArray[i][j];
//	}
//}
//
//System.out.println("Sum of all elements in the array: " + sum);
//
//}