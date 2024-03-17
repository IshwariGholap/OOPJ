package in.ass;

public class Student {
	String name="Ishwari";
	int Id=43;
	String Course="CDAC";
	
        public static void main(String args[]){
        	
        Student std=new Student();
        //std.name();
        //std.Id();
        //std.CDAC();
        
        System.out.println("name of student:" +std.name);
        System.out.println("Id of student:" +std.Id);
        System.out.println("Course of student:" +std.Course);
        }
}
