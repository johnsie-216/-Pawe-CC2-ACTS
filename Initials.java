import javax.swing.*;
	
public class Initials {
	public static void main(String [] args) {
	String first = "";
	String middle = "";
	String last = "";
	
	first =JOptionPane.showInputDialog("Enter your first name's initial:");
	char d = first.charAt(0);
	middle =JOptionPane.showInputDialog("Enter your middle name's initial:");
	char e = middle.charAt(0);
	last =JOptionPane.showInputDialog("Enter your last name's initial:");
	char f = last.charAt(0);
	JOptionPane.showMessageDialog(null,d + "" + e + "" + f);
	
	 
	}
}