package chap02;

public class VariableScopeExample {
	public static void main(String[] args) {
		int x = 10;
		if (x > 10) {
			int y = 5;
		}
//		int result = x + y;
//		System.out.println(result);
	}
}
