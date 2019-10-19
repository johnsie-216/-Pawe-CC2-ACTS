public class cc2_Lab3 {
	public static void main (String[] args) {
	char j = 'J';
	char o = 'O';
	char h = 'H';
	char n = 'N';
	char ex ='!';
	int a = j;
	int b = o;
	int c = h;
	int d = n;
	int e = ex;
	
	System.out.println("J-"+a);
	System.out.println("O-"+b);
	System.out.println("H-"+c);
	System.out.println("N-"+d);
	System.out.println("!-"+e);
	System.out.println(j+""+o+h+""+n+ex);
	
	int l=a+b+c+d+e;
	int f=a*b*c*d*e;
	int y=(a+b+c+d+e)/5;
	int t=0%y;
	
	System.out.println("sum:" + l);
	System.out.println("product:" + f);
	System.out.println("Average:" + y);
	System.out.println("remander:" + t);
	
	}
	}
	