package Transportation;


public class Person {
	public String PassengerName;   
	 public int age;              // 나이대
	public int station;
	public int fare;
	
	 public Person(String PassengerName, int age, int station)  // 나이와 거리 초기화하기
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
		 System.out.println(PassengerName + "은 나이가 "+age+ "살이고 지하철에서 총 " +station + "정거장을 이동하였습니다.");
	 }


}

/* subway 기본 요금
어린이: 600
청소년: 1000
성인: 1400
경로우대: 무료
    
이동 거리에 따라서 가격을 다르게 함
->subway
기본 요금: 10정거장
추가: 1정거장 당 20원 씩 */