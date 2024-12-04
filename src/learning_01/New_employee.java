package learning_01;

public class New_employee {


public static void main(String[] arg) 
{
	Oops_concept emp1=new Oops_concept();
	/*emp1.eid=10;
	emp1.name="Swaroop";
	emp1.salary=30000;
	emp1.dept="development";
	emp1.designation="front end";*/
	emp1.getValues(100,"Swaroop",1090,"Developing","FrontEnd");
	emp1.display();
}
}