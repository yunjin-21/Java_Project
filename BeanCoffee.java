package Cofffee;

public class BeanCoffee {

	int money;
	String BeanName;
	
	public BeanCoffee(String BeanName)
{
		this.BeanName = BeanName;
		}
	
	public void buy(int money) {
		this.money += money;
	}
	
	public void showInfo () {
		System.out.println(BeanName + "�� "+ money+"��ŭ ����鿴���ϴ�.");
	}
	
	
}


