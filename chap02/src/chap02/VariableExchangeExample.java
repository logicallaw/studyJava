package chap02;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 10;
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:"+x+", y:" +y);
	}
}
