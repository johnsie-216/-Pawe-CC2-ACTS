import java.util.Scanner;

public class Grades{
  public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Grade");
   int Grade = sc.nextInt();
		if(Grade >92 && Grade <=100){
		   System.out.println("A");
		}else if(Grade >87 && Grade <=91){
		   System.out.println("B+");
		}else if(Grade >83 && Grade <=86){
		   System.out.println("B");
		}else if(Grade >79 && Grade <=82){
		   System.out.println("C+");
		}else if(Grade >75 && Grade <=78){
		   System.out.println("C");
		}else if(Grade >70 && Grade <=74){
		   System.out.println("D");
		}else if(Grade <=70){
		   System.out.println("F");
		} else {
		System.out.println("Error");
		}
	}
}
				
				
		
		