package Inheritence;

public class OverridingTest {

	public static void main(String[] args) {
		
		int productPrice = 50000;
		Customer customerDog = new Customer(123456, "������");   //Customer �ν��Ͻ�
		
		
		System.out.println(customerDog.getCustomerName() +"���� ID�� " + customerDog.getCustomerID() + "�̸� " +customerDog.getCustomerName() +
				"���� �����ؾ� �� �ݾ��� "+ customerDog.calcPrice(productPrice) + "���̴�.");
		System.out.println(customerDog.showCustomerInfo());

/*���������� ID�� 123456�̸� ���������� �����ؾ� �� �ݾ��� 50000���̴�.
���Ҿ� ���������� SILVER����̱⿡, ���ʽ� ����Ʈ�� 1500�̴�.*/
		
		
		Customer customerK = new Customer(12345, "����");
		customerK.calcPrice(10000);
		customerK.calcPrice(20000);//����
		System.out.println(customerK.showCustomerInfo());

		
		
		
		
		VIPCustomer customerCat = new VIPCustomer(78910, "�����", 1886);  //VIPCustomer �ν��Ͻ� 
		System.out.println(customerCat.getCustomerName() +"���� ID�� " + customerCat.getCustomerID() +"�̸� " + customerCat.getCustomerName() +"���� �����ؾ��� �ݾ��� "
+ customerCat.calcPrice(productPrice) + "���̴�.");
		
		
	
		System.out.println("���Ҿ� "+customerCat.getCustomerName()+"���� "+customerCat.getCustomerGrade()+ "�����̱⿡ ID�� " 
		+customerCat.getAgentID() + "�� ���������� �����ϸ� ��ǰ������ 5%�� " + customerCat.bonus(productPrice) + "���� �����޽��ϴ�. ");
				
				
/*����̴��� ID�� 78910�̸� ����̴��� �����ؾ��� �ݾ��� 45000���̴�.
���Ҿ� ����̴��� VIP�����̱⿡ ID�� 1886�� ���������� �����ϸ� ��ǰ������ 5%�� 2500���� �����޽��ϴ�. */
		
	}
}
