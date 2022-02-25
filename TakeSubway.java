package Transportation;

public class TakeSubway {

	public static void main(String[] args) {

		Person universityStudentYunjin = new Person("Yunjin", 22, 19);   //일단 대학생 Yunjin은 22살이고 지하철에서 19정거장만큼 이동했다고 가정하자.
		

		  Subway subway2 = new Subway(2);
		  universityStudentYunjin.rideSubway(subway2);     // 대학생 Yunjin이 2호선 지하철을 이용한다고 가정하자.
		  
		  
		  universityStudentYunjin.showInfo();           //  출력 결과 : Yunjin은 나이가 22살이고 지하철에서 총 19정거장을 이동하였습니다.
		  subway2.showInfo();                // 출력 결과 : 지하철 2호선을 탄 이 탑승객은 총 1580원만큼의 돈을 지불하였습니다.
		 
		  
		  
		  Person grandma = new Person("grandmother", 68, 30);   //일단 할머니 grandmother은 68살이고 지하철에서 30정거장만큼 이동했다고 가정하자.
			

		  Subway subway3 = new Subway(3);
		  grandma.rideSubway(subway3);     // 할머니 grandmother가 3호선 지하철을 이용한다고 가정하자.
		  
		  
		  grandma.showInfo();           //  출력 결과 : grandmother은 나이가 68살이고 지하철에서 총 30정거장을 이동하였습니다.
		  subway3.showInfo();                // 출력 결과 : 지하철 3호선을 탄 이 탑승객은 총 400원만큼의 돈을 지불하였습니다.
		 
		  
}
}
