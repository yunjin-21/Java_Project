package cooperation;

public class Bus {
	   int busNumber;             // ���� ��ȣ
	   int fare;                 // ž�°��� �����ϴ� ������
		    
		 public Bus(int busNumebr)   // ���� ��ȣ�� �Ű������� �޴� ������
		 {   
			  this.busNumber = busNumebr;
		 }
		
		 
		 
		 public void pay(int fare)  {  
			  this.fare = fare;    
			 }
		    
		 public void showInfo() {      
			  System.out.println("���� " + busNumber + "���� ź �� ž�°��� " + fare + "����ŭ�� ���� �����Ͽ����ϴ�.");
		 }

		 
}
