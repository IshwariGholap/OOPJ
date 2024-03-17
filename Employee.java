package in.ass3;

public class Employee {
	public void emp1(String Name) {
		System.out.println("Name of employee:"+Name);
	}
	public void emp1(int empid,float Salary) {
		System.out.println("empid of employee:"+empid);
		System.out.println("Salary of employee:"+Salary);
	}
    public void emp1(String city,int contact,String Address) {
    	System.out.println("city of employee:"+city);
    	System.out.println("contact of employee:"+contact);
    	System.out.println("Address of employee:"+Address);
	}
	
	
	
			public static void main(String args[]) {
				Employee emp=new Employee();
				emp.emp1("ABC");
				emp.emp1(123456,50000.0f);
				emp.emp1("pune",1234567890,"loni");
			}
}
