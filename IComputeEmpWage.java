/**
 * 
 */
package emp_wage_final;

/**
 * @author MD_AFROZ
 *
 */

	public interface IComputeEmpWage{
		public void addCompanyEmpWage(String company, int empRatePerHour, 
				int numOfWorkingDays, int maxHoursPerMonth);
		public void computeEmpWage();
		public int getTotalEmpWage(String company);

	}

