package scanner;

import java.util.Scanner;

public class Runner {
	int x;
	int y;
	//static String str="";
	public static Scanner scanner=new Scanner(System.in);
	 public static void main(String args[])
	 
	  {
		 
			boolean flag=true;
			do
			{
				
			
		 System.out.println("Enter number x:");
		 int x=scanner.nextInt();
		 
		 System.out.println("Enter number y:");
		 int y=scanner.nextInt();
		 
		 System.out.println("Choose the operation to perform");
		 System.out.println("options\n-1\n-2\n-3\n-4");
		 int model = scanner.nextInt();
	      switch (model) {
		 case 1:
			 System.out.println(Calculator.add(x, y));
			 
			 break;
			 
		 case 2:
			 System.out.println(Calculator.sub(x, y));
			 
			 break;
			 
		 case 3:
			 System.out.println(Calculator.mul(x, y));
			 
			 break;
			 
			 
		 case 4:
			 System.out.println(Calculator.div(x, y));
			 
			 break;
			 
			 
			 
			 default:
				 System.out.println("No Option selected");
		 }
		 
		 
		 
		 
		 
	  
	  }while(flag);
	}
}