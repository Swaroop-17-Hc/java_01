 package learning_01;

public class Oops_concept {
	
		int eid;
		String name;
		double salary;
		String dept;
		String designation;
		
		/*void display()
		
		{
		System.out.println("eid:"+eid);
		System.out.println("name:"+name);
		System.out.println("salary:"+salary);
		System.out.println("dept:"+dept);
		System.out.println("designation:"+designation);
		}
		public static void main(String[] arg) 
		{
			Oops_concept emp1=new Oops_concept();
			emp1.eid=10;
			emp1.name="Swaroop";
			emp1.salary=30000;
			emp1.dept="development";
			emp1.designation="front end";*/
		void getValues(int i, String s, double d,String s1,String s2)
		{
			eid =i;
			name=s;
			salary=d;
			dept=s1;
			designation=s2;
			
		}
		void display()
		
		{
			System.out.println(eid+""+name+""+salary+""+dept+""+designation+"");
		}
		

}

