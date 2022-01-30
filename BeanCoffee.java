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
		System.out.println(BeanName + "은 "+ money+"만큼 벌어들였습니다.");
	}
	
	
}


