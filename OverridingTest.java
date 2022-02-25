package Inheritence;

public class OverridingTest {

	public static void main(String[] args) {
		
		int productPrice = 50000;
		Customer customerDog = new Customer(123456, "강아지");   //Customer 인스턴스
		
		
		System.out.println(customerDog.getCustomerName() +"님은 ID가 " + customerDog.getCustomerID() + "이며 " +customerDog.getCustomerName() +
				"님이 지불해야 할 금액은 "+ customerDog.calcPrice(productPrice) + "원이다.");
		System.out.println(customerDog.showCustomerInfo());

/*강아지님은 ID가 123456이며 강아지님이 지불해야 할 금액은 50000원이다.
더불어 강아지님은 SILVER등급이기에, 보너스 포인트는 1500이다.*/
		
		
		Customer customerK = new Customer(12345, "강아");
		customerK.calcPrice(10000);
		customerK.calcPrice(20000);//축적
		System.out.println(customerK.showCustomerInfo());

		
		
		
		
		VIPCustomer customerCat = new VIPCustomer(78910, "고양이", 1886);  //VIPCustomer 인스턴스 
		System.out.println(customerCat.getCustomerName() +"님은 ID가 " + customerCat.getCustomerID() +"이며 " + customerCat.getCustomerName() +"님이 지불해야할 금액은 "
+ customerCat.calcPrice(productPrice) + "원이다.");
		
		
	
		System.out.println("더불어 "+customerCat.getCustomerName()+"님은 "+customerCat.getCustomerGrade()+ "고객님이기에 ID가 " 
		+customerCat.getAgentID() + "인 전문상담원이 존재하며 제품가격의 5%인 " + customerCat.bonus(productPrice) + "원을 적립받습니다. ");
				
				
/*고양이님은 ID가 78910이며 고양이님이 지불해야할 금액은 45000원이다.
더불어 고양이님은 VIP고객님이기에 ID가 1886인 전문상담원이 존재하며 제품가격의 5%인 2500원을 적립받습니다. */
		
	}
}
