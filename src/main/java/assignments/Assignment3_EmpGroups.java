package assignments;

public class Assignment3_EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3_Employees obj= new Assignment3_Employees();
		String [] [] employeedetails = new String[2] [3];
		{
		employeedetails[0][0] = obj.employeename[0];
		employeedetails[0][1] = obj.employeename[1];
		employeedetails[0][2] = obj.employeename[2];
		employeedetails[1][0] = obj.employeeid[0];
		employeedetails[1][1] = obj.employeeid[1];
		employeedetails[1][2] = obj.employeeid[2];
		System.out.println("Employee Name:" + obj.employeename[0]+","+"Employee ID:" +obj.employeeid[0]);
		System.out.println("Employee Name:" + obj.employeename[1]+","+"Employee ID:" +obj.employeeid[1]);
		System.out.println("Employee Name:" + obj.employeename[2]+","+"Employee ID:" +obj.employeeid[2]);
		}
		}
	}

