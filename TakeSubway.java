package Transportation;

public class TakeSubway {

	public static void main(String[] args) {

		Person universityStudentYunjin = new Person("Yunjin", 22, 19);   //�ϴ� ���л� Yunjin�� 22���̰� ����ö���� 19�����常ŭ �̵��ߴٰ� ��������.
		

		  Subway subway2 = new Subway(2);
		  universityStudentYunjin.rideSubway(subway2);     // ���л� Yunjin�� 2ȣ�� ����ö�� �̿��Ѵٰ� ��������.
		  
		  
		  universityStudentYunjin.showInfo();           //  ��� ��� : Yunjin�� ���̰� 22���̰� ����ö���� �� 19�������� �̵��Ͽ����ϴ�.
		  subway2.showInfo();                // ��� ��� : ����ö 2ȣ���� ź �� ž�°��� �� 1580����ŭ�� ���� �����Ͽ����ϴ�.
		 
		  
		  
		  Person grandma = new Person("grandmother", 68, 30);   //�ϴ� �ҸӴ� grandmother�� 68���̰� ����ö���� 30�����常ŭ �̵��ߴٰ� ��������.
			

		  Subway subway3 = new Subway(3);
		  grandma.rideSubway(subway3);     // �ҸӴ� grandmother�� 3ȣ�� ����ö�� �̿��Ѵٰ� ��������.
		  
		  
		  grandma.showInfo();           //  ��� ��� : grandmother�� ���̰� 68���̰� ����ö���� �� 30�������� �̵��Ͽ����ϴ�.
		  subway3.showInfo();                // ��� ��� : ����ö 3ȣ���� ź �� ž�°��� �� 400����ŭ�� ���� �����Ͽ����ϴ�.
		 
		  
}
}
