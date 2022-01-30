package classpart;

import java.util.Calendar; //현재 시각 정보를 조회하거나 변경 연산을 수행하기위해 사용

public class MyDate {
	private int day;
	private int month;
	private int year; // private로 day month year를 선언
	private boolean isValid = true; // isValid라는 boolean형 변수를 선언하고 true로 변수를 초기화 (논리형 타입)

	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
		}//책에서 이러한 생성자 선언함.

	
	
	// private의 접근 제한자로 막아두고 각 필드의 Getter and Setter로 접근하는 방식을 취함, 
	public int getDay() {
		return day;
	}
// get 에서는 int 반환값이 있다. 매개변수 없다
	
	// set에서는 void 반환값이 없다. int day 매개변수 있다
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
				// 1일부터 31일까지 존재하는 1월 3월 5월 7월 8월 10월 12월 
			case 4: case 6: case 9: case 11:
				if (day <1 || day >30) {
					isValid = false;
				}
				else {
					this.day = day;
				}
				break;
				// 1일부터  30일까지 존재하는 4월 6월 9월 11월 
			case 2:
				if (( ( year % 4 ==0 &&  year % 100 !=0 ) || year % 400 ==0)){  //윤년: 년도가 4로 나누어떨어지고 100으로 나누어떨어지지않거나 400으로 나누어떨어질 경우 
					if (day <1 || day >29) {
						isValid = false;
					} 
					else {
						this.day = day;
					}
				}// 2월 중에서 윤년에만 존재하는 2월 29일이 포함될경우
				
				else {
					if (day <1 || day >28) {
						isValid = false;
					} 
					else {
						this.day = day;
					}
				} // 2월 중에서 윤년이 아니어서 2월 29일이 포함되지 않는 경우
				break;
			default:
				isValid = false; //조건식의 결과와 일치하는 case문이 없을 때 수행될 문장임.
		}
	}
 //switch(조건식) 사용
	
	
	
	
	
	public int getMonth() {
		return month;
	}


	// get에서는 int라는 반환값이 있다. 매개변수 없다 
		// set에서는 void라는 반환값이 없다. int month 매개변수 있다
	public void setMonth(int month) {
		if( month <1 || month >12) {
			isValid = false;
		}
		else {
			this.month = month;
		}
	}
	//1월부터 12월까지만 존재함 
	
	
	
	
	
	

	public int getYear() {
		return year;
	}


	// get 에서는 int 반환값이 있다. 매개변수 없다 
		// void 반환값이 없다. int year 매개변수 있다

	public void setYear(int year) {
		if (year > Calendar.getInstance().get(Calendar.YEAR)) {
			isValid = false;
		}
		else {
			this.year = year;
		}
	}
	// Calendar.getInstance().get(Calendar.YEAR) : 생성된 달력(Calendar) 인스턴스를 통해 날짜 관련 정보를 얻어낼 수 있는 메소드

	
	
	
	//String이라는 반환값이 있다.
	public String isValid() {

		if(isValid) {
			return "유효한 날짜입니다.";
		}
		else {
			return "유효하지 않은 날짜입니다.";
		}
	}
	

	

}

