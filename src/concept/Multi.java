package concept;

public class Multi {

	public static void main(String args[]) {

//		int a[][] = { { 1, 2 }, { 3, 4 } };
//		int b[][] = { { 1, 2 }, { 3, 4 } };
//		int c[][] = new int[2][2];
//
////	        c[0][0]=a[0][0]*b[0][0]+a[0][1]*b[1][0];
////	        c[0][1]=a[0][0]*b[0][1]+a[0][1]*b[1][1];
////	        c[1][0]=a[1][0]*b[0][0]+a[1][1]*b[1][0];
////	        c[1][1]=a[1][0]*b[0][1]+a[1][1]*b[1][1];
//
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				c[i][j] = 0;
//				for (int k = 0; k < 2; k++) {
//					c[i][j] += a[i][k] * b[k][j];
//				}
//				System.out.print(c[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
//
//}

		int a[][] = { { 1, 2 }, { 3, 4 } };
		int b[][] = { { 1, 2 }, { 3, 4 } };
		int c[][] = new int[2][2]; // the result matrix

// multiplication
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}

				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}

// display the result
