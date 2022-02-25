package Inheritence;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer()
	{
		customerGrade = "SILVER";
		bonusRatio = 0.03;

	}
	
	public Customer(int customerID, String customerName){
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.03;
	
	}
	
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return (int) price ;
	}
	
	public String showCustomerInfo(){
		return "���Ҿ� "+ customerName + "���� " + customerGrade + "����̱⿡, ���ʽ� ����Ʈ�� " + bonusPoint + "�̴�.";  
	}

	//CustomerID CustomerName CustomerGrade ��� protected (����,����,���δ� ������ ����)  ������ ������ ������ �ܺο��� ����� �� �ֵ��� get set �߰�
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}