package Cofffee;

public class CoffeeTest {
	public static void main(String[ ] args) {
		
		Person Lee = new Person("������", 10000); //Lee �ν��Ͻ����� �������� �������� 10000������ �ʱ�ȭ
		// ������ �մ� �Ѹ� ����!
		
		Person Kim = new Person("������", 20000); 
		
		StarCoffee namet = new StarCoffee("��Ÿ����");
		Lee.buyStarCoffee(namet);
		Lee.showInfo();
		namet.showInfo();
		
		
		
		BeanCoffee names = new BeanCoffee("Ŀ�Ǻ�");
		Kim.buyBeanCoffee(names);
		Kim.showInfo();
		names.showInfo();
				
		
	}

}
