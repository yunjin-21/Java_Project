package Cofffee;


public class Person {
	
	String name;
	int money;
			
	Person(String name, int money ){
			this.name = name;
			this.money = money;
			} // �����ڸ� ������ ��. �̸��� ��(�ܾ�) ����!
			
			
	
	public void buyStarCoffee(StarCoffee sCoffee) {
		sCoffee.buy(4000);
		this.money -= 4000;
	}
	
	
	public void buyBeanCoffee(BeanCoffee bCoffee) {
		bCoffee.buy(4500);
		this.money -= 4500;
	}
	
	public void showInfo() {
		System.out.println(name + "���� " + money +"���� ���ҽ��ϴ�.");
		
	}
	
}
