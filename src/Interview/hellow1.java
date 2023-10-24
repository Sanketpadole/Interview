package Interview;

public class hellow1 {

	public static void main(String[] args) {
		int[] a = { 12, 3, 4, 56, 7 };
		int result;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				result = a[i] + a[j];
				System.out.println(result);
			}
		}

	}

}
