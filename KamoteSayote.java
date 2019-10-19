import java.util.*;
public class KamoteSayote{

	public static void main(String args []) {
		Scanner Kamsay = new Scanner (System.in);
		int result1, result2;
			System.out.println("Enter Input: ");
				int N = Kamsay.nextInt ();
				int M = Kamsay.nextInt ();
				int K = Kamsay.nextInt ();
				
				result1 = N/M;
				result2 = (N%M)*K;
			if (N >=1&&M >=1&&K >=1&&N<= 1000&&M <+ 1000&&K <= 1000){
				System.out.println(result1 + "Kamote");
				System.out.println(result2 + "sayotes");
			}else{
				System.out.println("Invalid Input");
				}
	}
}	