package empwageproblems;

public class EmpWage {
	public static void main(String[] args) {
		int empRatePerHr = 20;
		int empWorkingHr;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		int i = (int)empCheck;
		switch(i) {
		case 1:
			empWorkingHr = 8;
			break;
		case 2:
			empWorkingHr = 4;
			break;
		default:
			empWorkingHr = 0;
		}
	int salary = empWorkingHr  * empRatePerHr;
	System.out.println("Salary is :" + salary);
	}		
}