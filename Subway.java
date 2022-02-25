package Transportation;

public class Subway {


	   int subwayLine;             // 지하철노선
	   int fare;                 // 탑승객이 지불하는 교통요금
		    
		 public Subway(int subwayLine)   // 지하철 노선을 매개변수로 받는 생성자
		 {   
			  this.subwayLine = subwayLine;
		 }
		
		 
		 
		 public void pay(int fare)  {  
			  this.fare = fare;    
			 }
		    
		 public void showInfo() {      
			  System.out.println("지하철 " +subwayLine + "호선을 탄 이 탑승객은 총 " + fare + "원만큼의 돈을 지불하였습니다.");
		 }

		 
}
