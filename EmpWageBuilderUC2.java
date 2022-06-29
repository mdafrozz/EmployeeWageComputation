/**
 * 
 */
package emp_wage_computation;

/**
 * @author MD_AFROZ
 *
 */
public class EmpWageBuilderUC2 {
	
	public static void main(String args[])
	{
		//Constants
		int IS_FULLTIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		//Variables
		int empHrs = 0;
		int empWage = 0;
					//Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULLTIME)
		{	empHrs = 8;
			System.out.println("Employee is Present");
		}
		else 
		{	empHrs = 0;
			System.out.println("Employee is Absent");
		}
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Daily wage is: "+empWage);
	}
}
