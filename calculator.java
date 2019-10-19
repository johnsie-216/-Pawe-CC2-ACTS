import java.util.*;

public class calculator{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	String operation;
	int a, b;
	 System.out.println("Enter # of operations;");
	 int num = sc.nextInt();
	 //num = sc.nextInt(); sc.nextInt() = 2; num = 2
	 //a = b; b = c; a = c
	 if(num >=1 && num<=100){
	 System.out.println("Enter all operations in one line");
	   for(int counter = 1; counter <= num; counter ++){
	    operation = sc.next();
		
	   if(operation.equals("negate")){
	   a=sc.nextInt();
			System.out.println(-a);
	   }else if(operation.equals("add")){
	   a = sc. nextInt();
	   b = sc. nextInt();
	   System.out.println(a+b);
	   }else if (operation.equals("max")){
		a = sc.nextInt();
		b = sc.nextInt();
		if (a>b){
		 System.out.println(a);
		}
		else{ 
	    System.out.println(b);
	    }
    }
  }
  }
  
}
}