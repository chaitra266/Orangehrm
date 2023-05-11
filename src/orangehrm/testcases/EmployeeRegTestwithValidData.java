package orangehrm.testcases;

import orangehrm.library.Employee;
import orangehrm.library.LoginPage;
import utils.AppUtils;

public class EmployeeRegTestwithValidData 
{

	public static void main(String[] args) 
	{
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		
		Employee emp = new Employee();
		boolean res = emp.addEmployee("Balakrishna", "G");
		if(res)
		{
			System.out.println("New Employee Registered Successfully, test pass");
		}else
		{
			System.out.println("New Employee Registion test fail");
		}
		lp.logout();
		AppUtils.closeApp();

	}

}
