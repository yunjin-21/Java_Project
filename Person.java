package cooperation;

public class Person {
	 public String PassengerName;   
	 public int age;             
	public int distance;
	public int fare;
	
	 public Person(String PassengerName, int age, int distance) { // ���̿� �Ÿ� �ʱ�ȭ�ϱ� 
		  
		  this.PassengerName = PassengerName;
		  this.age = age;
		  this.distance = distance;
		 
	 

	 if (age<=13) {
		 if(distance <2000) {

			 fare = 450;}
		 else {
			 fare = 450 + 100*((distance - 2000)/500);	}			 
			 
	 }
	 else if (age<20){
		 if(distance <2000) {

			 fare = 720;}
		 else {
			 fare = 720 + 100*((distance - 2000)/500);				 
		 }
	 }
		 
	 else if (age<=65){
		 if(distance <2000) {

			 fare = 1250;}
		 else { 
			 fare = 1250 + 100*((distance - 2000)/500);				 
		 }
	 }
	 else  {
		 if(distance <2000) {

			 fare = 500;}
		 else {
			 fare = 500 + 100*((distance - 2000)/500);				 
		 }
	 }
	
	 
	 } //
	
	 
	 public void rideBus(Bus bus) {
		 
		 bus.pay(fare);
		 }
	
	    
	 public void showInfo() {
		 System.out.println(PassengerName + "�� ���̰� "+age+ "���̰� �������� " +distance + "m�� �Ÿ��� �̵��Ͽ����ϴ�.");
	 }


}

/* bus �⺻ ���
���: 450
û�ҳ�: 720
����: 1250
��ο��: 500

�̵� �Ÿ��� ���� ������ �ٸ��� 
-> bus
�⺻ ���: 2km
�߰�: 500m �� 100�� �� */


/* money(fare) ������ ����
�޼��� ���� distance >2000 ���
money = fare; 
�޼��� 2��
1.fare�� ����
2. �Ÿ�>2000�϶� �� �����

  
  */



