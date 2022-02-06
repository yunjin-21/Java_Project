package cooperation;

public class Person {
	 public String PassengerName;   
	 public int age;             
	public int distance;
	public int fare;
	
	 public Person(String PassengerName, int age, int distance) { // 나이와 거리 초기화하기 
		  
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
		 System.out.println(PassengerName + "은 나이가 "+age+ "살이고 버스에서 " +distance + "m의 거리를 이동하였습니다.");
	 }


}

/* bus 기본 요금
어린이: 450
청소년: 720
성인: 1250
경로우대: 500

이동 거리에 따라서 가격을 다르게 
-> bus
기본 요금: 2km
추가: 500m 당 100원 씩 */


/* money(fare) 변수를 생성
메서드 생성 distance >2000 경우
money = fare; 
메서드 2개
1.fare값 대입
2. 거리>2000일때 식 만들기

  
  */



