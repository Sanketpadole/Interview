package concept;

public class Palindrome {
	public static void main(String[] args) {
		int a = 121;
		int b;
		int rem;
		int revNum = 0;
		int originalNum = a;
		while (a != 0) {
			rem = a % 10;
			a = a / 10;
			revNum = revNum + rem;

		}
		if (revNum == originalNum) {
			System.out.println(revNum);
		}
	}

}
