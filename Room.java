import java.io.*;

public class Room {
	public static void main(String args []) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader ar = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter length:");
			String inputString = br.readLine();
			double length = Double.parseDouble(inputString);
		System.out.println("Enter width:");
			String inputtring = ar.readLine();
			double width = Double.parseDouble(inputtring);
			double su = length * width;
		System.out.println("The floor space is "+ su +"square units.");
		}
	}
		