package in.nested;

class parent{
	static int a=10;
	int b=20;
	private static int c=30;
	
	static class child{
		void display() {
			System.out.println(a);
			//System.out.print(b);
			System.out.println(c);
		}
		
	}
	
}


public class outer {

	public static void main(String[] args) {
		parent.child obj=new parent.child();
		obj.display();
	}

}
