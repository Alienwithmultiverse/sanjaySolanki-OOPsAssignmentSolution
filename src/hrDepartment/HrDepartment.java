package hrDepartment;

import superDepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		String value = "Hr Department";
		return value;
	}
	
	public String getTodaysWork() {
		String value = "Fill today’s worksheet and mark your attendance";
		return value;
	}
	
	public String getWorkDeadline() {
		String value = "Complete by EOD";
		return value;
	}
	
	public String doActivity() {
		String value = "team Lunch";
		return value;
	}
}
