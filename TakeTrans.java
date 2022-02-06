package cooperation;


public class TakeTrans {
	public static void main(String[] args) {


	
		  Person universityStudentYunjin = new Person("Yunjin", 22, 16000);   //일단 대학생 Yunjin은 22살이고 16000m 거리를 이동했다고 가정하자.
	

		  
		 
		  Bus bus4412 = new Bus(4412);
		  universityStudentYunjin.rideBus(bus4412);     // 대학생 Yunjin이 4412번 버스를 탄다고 가정하자.
		  
		  
		  universityStudentYunjin.showInfo();           // 출력 결과 : Yunjin은 나이가 22살이고 버스를 통해 16000m의 거리를 이동하였습니다.
		  bus4412.showInfo();                // 출력 결과 : 버스 4412번을 탄 이 탑승객은 4050원만큼의 돈을 지불하였습니다.
		 
		  
}
}
