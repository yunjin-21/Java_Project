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
		System.out.println(StarName + "는 "+ money+"만큼 벌어들였습니다.");
	}
	
	
}
