package cooperation;

public class Bus {
	   int busNumber;             // 버스 번호
	   int fare;                 // 탑승객이 지불하는 교통요금
		    
		 public Bus(int busNumebr)   // 버스 번호를 매개변수로 받는 생성자
		 {   
			  this.busNumber = busNumebr;
		 }
		
		 
		 
		 public void pay(int fare)  {  
			  this.fare = fare;    
			 }
		    
		 public void showInfo() {      
			  System.out.println("버스 " + busNumber + "번을 탄 이 탑승객은 " + fare + "원만큼의 돈을 지불하였습니다.");
		 }

		 
}
