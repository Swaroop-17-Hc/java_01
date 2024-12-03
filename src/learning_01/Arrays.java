package learning_01;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//what are arrays? A variable which can hold multiple value for same data type
		//2 types of arrays available
		// => single dimensional array
		//=>two dimensional/ multi dimensional array
		int a[] =new int[5];
	 a[0]=100;
	 a[1]=200;
	 a[2]=300;
	 a[3]=400;
	 a[4]=500;
	 
	 int a1[]={100,200,300,400,500};
	 for(int i=0;i<=a1.length-1;i++)
	 {
		// System.out.println(a[i]);
	 }
	 int b[]= {100,200,300,400,500,600,700};
	 for(int i:b)
	 {
		 //System.out.println(i);
	 }
	 
	 //two dimensional array
	 int c[][]= {{100,200},{200,300},{300,400}};
	 for(int i=0;i<c.length;i++) {
		 for(int j=0;j<c[i].length;j++) {
			 System.out.println(c[i][j]);
		 }
	 }
	 
	}

}