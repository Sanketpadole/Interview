package concept;

import java.util.Arrays;

public class InsertionSort1 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 12, 23, 4, 53, 16 }, { 3, 12, 3, 8, 53, 16 }, { 4, 12, 23, 47, 63, 16 },
				{ 15, 14, 23, 4, 53, 16 }, { 61, 12, 3, 44, 57, 86 } };

		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr[i]); // sort the current row in ascending order
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0 && i == 0) {
					System.out.print("[" + arr[i][j] + "]");
				} else if (j == 0) {
					System.out.print("\n[" + arr[i][j] + "]");
				} else {
					System.out.print("," + arr[i][j]);
				}
			}
		}
	}

}
