package sec03.exam01;
//소스 파일(java) 및 컴파일된 바이트 코드 파일을 기능별로 쉽게 관리하기 위해 자바는 패키지를 사용한다.
//이때, 패키지는 마치 파일 시스템의 폴더(디렉토리)와 비슷하다.
//패키지가 없는 프로젝트가 없기 때문에 JDK 버전과 상관없이 패키지를 만드는게 좋다.
/*
	작성자 : 홍길동
	작성일 : 2024.03.06
 */

public class Hello { //바이트코드로 변환시 클래스명인 Hello는 .class가 붙어서 Hello 클래스를 생성한다.
	//java 명령어로 바이트 코드 파일을 실행하면 제일 먼저 main() 메소드를 찾아 블록 내부를 실행하게 된다.
	//따라서, main() 메소드를 프로그램 실행 진입점이라고 한다.
	public static void main(String[] args) {
		//콘솔에 출력하는 실행문
		System.out.println("Hello Java!"); //실행문 끝에 반드시 세미콜론을 붙여야한다.
		int x; //변수 x 선언
		x = 1; //변수 x에 1을 저장
		int y = 2; //변수 y를 선언
		int result = x + y; //변수 result 선언하고 x와 y를 더한 값을 저장
		System.out.println(result); //println 메소드 호출
	} //프로그램 실행 끝 지점

} //클래스 끝 지점
