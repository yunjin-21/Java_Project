package Transportation;


public class Person {
	public String PassengerName;   
	 public int age;              // ���̴�
	public int station;
	public int fare;
	
	 public Person(String PassengerName, int age, int station)  // ���̿� �Ÿ� �ʱ�ȭ�ϱ�
	 {   
		  
		  this.PassengerName = PassengerName;
		  this.age = age;
		  this.station = station;
		 
	 

		  if (age<=13) {
				 if(station <= 10) {

					 fare = 600;}
				 else {
					 fare = 600 + 20*(station -10);	}			 
					 
			 }
			 else if (age<20){
				 if(station <= 10) {

					 fare = 1000;}
				 else {
					 fare = 1000 + 20*(station -10);		 
				 }
			 }
				 
			 else if (age<=65){
				 if(station <= 10) {

					 fare = 1400;}
				 else { 
					 fare = 1400 + 20*(station -10);		 
				 }
			 }
			 else  {
				 if(station <= 10) {

					 fare = 0;}
				 else {
					 fare = 0 + 20*(station -10);						 
				 }
			 }
	 }
	
	 
	 public void rideSubway(Subway subway) {
		 
		 subway.pay(fare);
		 }
	
	    
	 public void showInfo() {
		 System.out.println(PassengerName + "�� ���̰� "+age+ "���̰� ����ö���� �� " +station + "�������� �̵��Ͽ����ϴ�.");
	 }


}

/* subway �⺻ ���
���: 600
û�ҳ�: 1000
����: 1400
��ο��: ����
    
�̵� �Ÿ��� ���� ������ �ٸ��� ��
->subway
�⺻ ���: 10������
�߰�: 1������ �� 20�� �� */