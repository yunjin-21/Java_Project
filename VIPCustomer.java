package Inheritence;

public class VIPCustomer extends Customer{

	private int agentID; // 상담원 아이디
	double saleRatio;

	
	public VIPCustomer()
	{
		customerGrade = "VIP";
		bonusRatio = 0.05; // 보너스 포인트 5% 적립
		saleRatio = 0.1; //제품가격을 10% 할인

	}
	
	public VIPCustomer(int customerID, String customerName, int agentID){
		super(customerID, customerName); //Customer 생성자를 부르기위해
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;

	}
	
	public int calcPrice(int price){
	
		return price - (int)(price * saleRatio); //VIP고객이 지불할 금액
	}
	
	
	
	
	public int bonus(int price){
		
		return (int) (price * bonusRatio); 
	}
	
	public int getAgentID(){
		return agentID;
	}
	
	
	public String getCustomerGrade(){
		return customerGrade;
	}
	
	
}