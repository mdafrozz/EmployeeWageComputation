/**
 * 
 */
package emp_wage_computation;

/**
 * @author MD_AFROZ
 *
 */
public class EmpBuilderUC1 {

	public static void main(String args[])
	{
		//Constants
		int IS_FULLTIME = 1;
			//Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULLTIME)
			System.out.println("Employee is Present");
		else 
			System.out.println("Employee is Absent");
	}
}
