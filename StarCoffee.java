package Cofffee;

public class StarCoffee {

	int money;
	String StarName;
	
	public StarCoffee(String StarName)
{
		this.StarName = StarName;
		}
	
	public void buy(int money) {
		this.money += money;
	}
	
	public void showInfo () {
		System.out.println(StarName + "�� "+ money+"��ŭ ����鿴���ϴ�.");
	}
	
	
}
