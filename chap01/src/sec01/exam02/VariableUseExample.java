package sec01.exam02;

public class VariableUseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 3;
		int minute = 5;
		//자바는 파이썬처럼 산술연산식으로 변수를 사용할 수 있음.
		System.out.println(hour + "시간" + minute + "분");
		int totalMinute = (hour * 60) + minute;
		System.out.println("총 " + totalMinute + "분");
	}

}
