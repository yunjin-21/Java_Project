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
		return "더불어 "+ customerName + "님은 " + customerGrade + "등급이기에, 보너스 포인트는 " + bonusPoint + "이다.";  
	}

	//CustomerID CustomerName CustomerGrade 모두 protected (하위,동일,내부는 접근이 가능)  예약어로 선언한 변수를 외부에서 사용할 수 있도로 get set 추가
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