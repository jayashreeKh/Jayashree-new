package CodeMind_B10;

public class EmployeeObject {

	int eid;
	String ename;
	String job;
	int sal;
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}
	
	public static void main(String[] args) {
		EmployeeObject emp1= new EmployeeObject();
		emp1.eid=501;
		emp1.ename="Jayashri";
		emp1.job="QA";
		emp1.sal=500000;
		emp1.display();
				
	}
}
