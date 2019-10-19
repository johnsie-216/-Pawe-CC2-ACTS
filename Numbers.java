import java.util.*;
import java.io.*;	
public class Numbers{
	public static void main (String [] args){
	  Scanner sc = new Scanner (System.in);
	try{  System.out.println("Input 6 #; ");

	  
	  int num1= sc.nextInt();
	  int num2= sc.nextInt();
	  int num3= sc.nextInt();
	  int num4= sc.nextInt();
	  int num5= sc.nextInt();
	  int num6= sc.nextInt();
	  
	if (num1 >=0 && num2 <=9 && num2 <=9 && num3 >=0 && num3 <=9 && num4 >=0 &&num4 <=9 && num5 >=0 &&num5 <=9 && num6 >=0 &&num6 <=9){
	for (int i=)
	  int num = 11;
	  while (num<99){
	  int tens = num/10;
	  int ones =num % 10;
	  boolean ten = tens == num1 || tens == num2||tens == num3||tens == num4||tens == num5||tens == num6;
	  boolean one = ones == num1 || ones == num3||ones == num4||ones == num5||ones == num5||ones == num6;
	  if (ten == true || one == true){
	  num ++;
	  continue;
	  }
	  else{
		  
		         System.out.println(num);
			     num ++;
				 
	  }}
	   }catch (Exception num){
		       System.out.print("Invalid input");
	        }
		  

 

}  
}	  
	
 
 
	  
	  
	  
	   
	  
	