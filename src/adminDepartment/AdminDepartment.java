package adminDepartment;

import superDepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		String value = "Admin Department";
		return value;
	}
	
	public String getTodaysWork() {
		String value = "Complete your documents Submission";
		return value;
	}
	
	public String getWorkDeadline() {
		String value = "Complete by EOD";
		return value;
	}
}
