package day1;

import today.circle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//���簢�� Ŭ����(Rect)
		//���簢�� ������ ���Ͽ� �ʿ��� ��Ҹ� ��� ������ ���簢���� ��Ÿ���� ����
		//��ɵ��� ��� �޼ҵ�� �����Ͽ� main �޼ҵ忡�� �׽�Ʈ �غ��ÿ�.
		circle c1= new  circle();
		c1.printCircle();
		c1.moveCenter(10, 10);
		c1.printCircle();
		c1.resize(10.1);
		c1.printCircle();
	}

}
