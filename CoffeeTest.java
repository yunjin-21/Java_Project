package Cofffee;

public class CoffeeTest {
	public static void main(String[ ] args) {
		
		Person Lee = new Person("이윤진", 10000); //Lee 인스턴스에서 이윤진이 가진돈을 10000원으로 초기화
		// 이윤진 손님 한명 생성!
		
		Person Kim = new Person("김윤진", 20000); 
		
		StarCoffee namet = new StarCoffee("스타벅스");
		Lee.buyStarCoffee(namet);
		Lee.showInfo();
		namet.showInfo();
		
		
		
		BeanCoffee names = new BeanCoffee("커피빈");
		Kim.buyBeanCoffee(names);
		Kim.showInfo();
		names.showInfo();
				
		
	}

}
