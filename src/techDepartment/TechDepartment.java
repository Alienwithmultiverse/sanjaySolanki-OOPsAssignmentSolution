package techDepartment;

import superDepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment{
	public String departmentName() {
		String value = "Tech Department";
		return value;
	}
	
	public String getTodaysWork() {
		String value = "Complete coding of module 1";
		return value;
	}
	
	public String getWorkDeadline() {
		String value = "Complete by EOD";
		return value;
	}
	
	public String getTechStackInformation() {
		String value = "core Java";
		return value;
	}
}
