/**
 * 
 */
package emp_wage_computation;

/**
 * @author MD_AFROZ
 *
 */
public class EmpWageBuilderMultiCompany {
	//Constants
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;

	public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		//Variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		//Computation
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empCheck) {
			case PART_TIME:
				empHrs = 4;
				break;
			case FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs; // empHrs + 1
			System.out.println("Day " + totalWorkingDays + " Employee Working Hrs: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Employee Wage of Company " + company + " is: " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		computeEmpWage("DELL", 20, 2, 10);
		computeEmpWage("LENOVO", 10, 4, 20);
		computeEmpWage("BRIDGELABZ", 50, 6, 40);

	}
}
