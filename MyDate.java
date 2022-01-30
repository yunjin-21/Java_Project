package classpart;

import java.util.Calendar; //���� �ð� ������ ��ȸ�ϰų� ���� ������ �����ϱ����� ���

public class MyDate {
	private int day;
	private int month;
	private int year; // private�� day month year�� ����
	private boolean isValid = true; // isValid��� boolean�� ������ �����ϰ� true�� ������ �ʱ�ȭ (���� Ÿ��)

	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
		}//å���� �̷��� ������ ������.

	
	
	// private�� ���� �����ڷ� ���Ƶΰ� �� �ʵ��� Getter and Setter�� �����ϴ� ����� ����, 
	public int getDay() {
		return day;
	}
// get ������ int ��ȯ���� �ִ�. �Ű����� ����
	
	// set������ void ��ȯ���� ����. int day �Ű����� �ִ�
	public void setDay(int day) {
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if (day <1 || day >31) {
					isValid = false;
				}
				else {
					this.day = day;
				}
				break;
				// 1�Ϻ��� 31�ϱ��� �����ϴ� 1�� 3�� 5�� 7�� 8�� 10�� 12�� 
			case 4: case 6: case 9: case 11:
				if (day <1 || day >30) {
					isValid = false;
				}
				else {
					this.day = day;
				}
				break;
				// 1�Ϻ���  30�ϱ��� �����ϴ� 4�� 6�� 9�� 11�� 
			case 2:
				if (( ( year % 4 ==0 &&  year % 100 !=0 ) || year % 400 ==0)){  //����: �⵵�� 4�� ����������� 100���� ������������ʰų� 400���� ��������� ��� 
					if (day <1 || day >29) {
						isValid = false;
					} 
					else {
						this.day = day;
					}
				}// 2�� �߿��� ���⿡�� �����ϴ� 2�� 29���� ���Եɰ��
				
				else {
					if (day <1 || day >28) {
						isValid = false;
					} 
					else {
						this.day = day;
					}
				} // 2�� �߿��� ������ �ƴϾ 2�� 29���� ���Ե��� �ʴ� ���
				break;
			default:
				isValid = false; //���ǽ��� ����� ��ġ�ϴ� case���� ���� �� ����� ������.
		}
	}
 //switch(���ǽ�) ���
	
	
	
	
	
	public int getMonth() {
		return month;
	}


	// get������ int��� ��ȯ���� �ִ�. �Ű����� ���� 
		// set������ void��� ��ȯ���� ����. int month �Ű����� �ִ�
	public void setMonth(int month) {
		if( month <1 || month >12) {
			isValid = false;
		}
		else {
			this.month = month;
		}
	}
	//1������ 12�������� ������ 
	
	
	
	
	
	

	public int getYear() {
		return year;
	}


	// get ������ int ��ȯ���� �ִ�. �Ű����� ���� 
		// void ��ȯ���� ����. int year �Ű����� �ִ�

	public void setYear(int year) {
		if (year > Calendar.getInstance().get(Calendar.YEAR)) {
			isValid = false;
		}
		else {
			this.year = year;
		}
	}
	// Calendar.getInstance().get(Calendar.YEAR) : ������ �޷�(Calendar) �ν��Ͻ��� ���� ��¥ ���� ������ �� �� �ִ� �޼ҵ�

	
	
	
	//String�̶�� ��ȯ���� �ִ�.
	public String isValid() {

		if(isValid) {
			return "��ȿ�� ��¥�Դϴ�.";
		}
		else {
			return "��ȿ���� ���� ��¥�Դϴ�.";
		}
	}
	

	

}

