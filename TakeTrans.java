package cooperation;


public class TakeTrans {
	public static void main(String[] args) {


	
		  Person universityStudentYunjin = new Person("Yunjin", 22, 16000);   //�ϴ� ���л� Yunjin�� 22���̰� 16000m �Ÿ��� �̵��ߴٰ� ��������.
	

		  
		 
		  Bus bus4412 = new Bus(4412);
		  universityStudentYunjin.rideBus(bus4412);     // ���л� Yunjin�� 4412�� ������ ź�ٰ� ��������.
		  
		  
		  universityStudentYunjin.showInfo();           // ��� ��� : Yunjin�� ���̰� 22���̰� ������ ���� 16000m�� �Ÿ��� �̵��Ͽ����ϴ�.
		  bus4412.showInfo();                // ��� ��� : ���� 4412���� ź �� ž�°��� 4050����ŭ�� ���� �����Ͽ����ϴ�.
		 
		  
}
}
