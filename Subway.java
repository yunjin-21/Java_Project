package Transportation;

public class Subway {


	   int subwayLine;             // ����ö�뼱
	   int fare;                 // ž�°��� �����ϴ� ������
		    
		 public Subway(int subwayLine)   // ����ö �뼱�� �Ű������� �޴� ������
		 {   
			  this.subwayLine = subwayLine;
		 }
		
		 
		 
		 public void pay(int fare)  {  
			  this.fare = fare;    
			 }
		    
		 public void showInfo() {      
			  System.out.println("����ö " +subwayLine + "ȣ���� ź �� ž�°��� �� " + fare + "����ŭ�� ���� �����Ͽ����ϴ�.");
		 }

		 
}
