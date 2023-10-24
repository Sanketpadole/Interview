package concept;

public class review1 {
	public static void main(String[] args) {
		int arr1[][] = { { 1, 2 }, { 3, 4 } };
		int arr2[][] = { { 1, 2 }, { 3, 4 } };
		int col;
		int row;
		int mul = 1;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {

				mul = mul * arr1[i][j] * arr2[i][j];
			}

		}
		System.out.print(mul + " ");
	}

}

//int mul = 0;
//
//for (int i = 0; i < myArray.length; i++) {
//	for (int j = 0; j < myArray[i].length; j++) {
//		sum += myArray[i][j];
//	}
//}