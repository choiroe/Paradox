package day1;

import today.circle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//직사각형 클래스(Rect)
		//직사각형 생성을 위하여 필요한 요소를 멤버 변수로 직사각형을 나타내기 위한
		//기능들을 멤버 메소드로 구현하여 main 메소드에서 테스트 해보시오.
		circle c1= new  circle();
		c1.printCircle();
		c1.moveCenter(10, 10);
		c1.printCircle();
		c1.resize(10.1);
		c1.printCircle(); 
	}

}
