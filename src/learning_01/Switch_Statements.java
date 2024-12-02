package learning_01;

public class Switch_Statements {
	public static void main(String[] args) {
		
		int day =6;
		
		switch(day){
		
		case 1: System.out.println("Sunday"); break;
		case 2: System.out.println("Monday"); break;
		case 3: System.out.println("Tuesday"); break;
		case 4: System.out.println("Wednesday"); break;
		case 5: System.out.println("Thursday");break;
		case 6: System.out.println("Friday");break; 
		case 7: System.out.println("Saturday"); break;
		default:  System.out.println("Invalid"); 
		}
	
		//Example = Switch two numbers
		
		int a =10 ; int b=20 ;
		 System.out.println(a + "&" + b + " : before the swap");
		 a = a+b;
		 b= a-b;
		 a= a-b;
		 System.out.println(a + "&" + b +" : After the Swap");
	}
}
