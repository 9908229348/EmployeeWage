package empwageproblems;

public class EmpWage {
	public static void main(String[] args) {
		int is_FULL = 1;
		int empRatePerHr = 20;
		int empWorkingHr = 8;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == is_FULL) {
			System.out.println("Employee is present");
		    int salary = empRatePerHr * empWorkingHr;
		    System.out.println("Salary is :" +salary);
		}
		    else
		    {
		    	System.out.println("Employee is absent");
		        System.out.println("Salary is 0");
		    }    
		}
	}