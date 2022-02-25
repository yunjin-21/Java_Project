package Inheritence;

public class VIPCustomer extends Customer{

	private int agentID; // ���� ���̵�
	double saleRatio;

	
	public VIPCustomer()
	{
		customerGrade = "VIP";
		bonusRatio = 0.05; // ���ʽ� ����Ʈ 5% ����
		saleRatio = 0.1; //��ǰ������ 10% ����

	}
	
	public VIPCustomer(int customerID, String customerName, int agentID){
		super(customerID, customerName); //Customer �����ڸ� �θ�������
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;

	}
	
	public int calcPrice(int price){
	
		return price - (int)(price * saleRatio); //VIP���� ������ �ݾ�
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