/**
 * 
 */
package emp_wage_final;

import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

/**
 * @author MD_AFROZ
 *
 */

public class EmpWageBuilder implements IComputeEmpWage {
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	//private int numOfCompany = 0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> companyToEmpWageMap;
	
	public EmpWageBuilder() {
		this.companyEmpWageList = new LinkedList<>();
		companyToEmpWageMap = new HashMap<>();
	}
	
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays,
			int maxHoursPerMonth) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, 
				empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWageMap.put(company, companyEmpWage);
	}
	public void computeEmpWage() {
		for(int i = 0; i < companyEmpWageList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}
	public int getTotalEmpWage(String company) {
		return companyToEmpWageMap.get(company).totalEmpWage;
	}
	
	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		//Variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		//Computation
		while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && 
				totalWorkingDays < companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs; // empHrs + 1
			System.out.println("Day " + totalWorkingDays + " Employee Working Hrs: " + empHrs);
		}
		return totalEmpHrs * companyEmpWage.empRatePerHour;

	}
	public static void main(String[] args) {
		IComputeEmpWage empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage( "Dmart",20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilder.computeEmpWage();
		System.out.println("Total Wage of Dmart company:"+empWageBuilder.getTotalEmpWage("Dmart"));
		System.out.println("Total Wage of Reliance company:"+empWageBuilder.getTotalEmpWage("Reliance"));
	}

	
}
