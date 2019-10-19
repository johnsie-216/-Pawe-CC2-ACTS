import java.lang.Math.*;

public class  CC2_Lab5 {
	
    public static void main(String [] args){
	  
	    double messageCount = Math.random() * 1000;
	    int typecast = (int)messageCount;
	    double charges =0;
	    System.out.println("You have sent " + typecast + "message.");
		    if(typecast > 200){
			    charges=(typecast-200) * 0.5;
			    System.out.println("you have incurred "+ charges + " PHP in charges.");
			}
	}
	}