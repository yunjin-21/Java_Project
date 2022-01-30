package Cofffee;


public class Person {
	
	String name;
	int money;
			
	Person(String name, int money ){
			this.name = name;
			this.money = money;
			} // 생성자를 만들어야 함. 이름과 돈(잔액) 생성!
			
			
	
	public void buyStarCoffee(StarCoffee sCoffee) {
		sCoffee.buy(4000);
		this.money -= 4000;
	}
	
	
	public void buyBeanCoffee(BeanCoffee bCoffee) {
		bCoffee.buy(4500);
		this.money -= 4500;
	}
	
	public void showInfo() {
		System.out.println(name + "님이 " + money +"원이 남았습니다.");
		
	}
	
}
