package marcusQuickMeth;

import javax.swing.JOptionPane;

public class QuickMeth {

	
	/**
	 * @author marcus8448
	 * Version 2.1.0
	 */
	public static void main(String[] args)  {
		JOptionPane.showMessageDialog(null, "Quick Meth Version 2.0 By Marcus", "About", 1);
		String SMultiA = JOptionPane.showInputDialog(null, "Enter the first number to be multiplied", "Enter a number", 3);
		double MultiA = Double.parseDouble(SMultiA);
		String SMultiB = JOptionPane.showInputDialog(null, "Enter the second number to be multiplied", "Enter a Number", 3);
		double MultiB = Double.parseDouble(SMultiB);
		double MAnswer = MultiA * MultiB;
		JOptionPane.showMessageDialog(null, MAnswer,"The Answer", 1); 
		
		String SDivA = JOptionPane.showInputDialog(null, "Enter the first number to be divided", "Enter a number", 3);
		double DivA = Double.parseDouble(SDivA);
		String SDivB = JOptionPane.showInputDialog(null, "Enter the second number to be divided", "Enter a Number", 3);
		double DivB = Double.parseDouble(SDivB);
		double DAnswer = DivA / DivB;
		JOptionPane.showMessageDialog(null, DAnswer,"The Answer", 1);
		
		String SSubA = JOptionPane.showInputDialog(null, "Enter the first number to be subtracted", "Enter a number", 3);
		double SubA = Double.parseDouble(SSubA);
		String SSubB = JOptionPane.showInputDialog(null, "Enter the second number to be subtracted", "Enter a Number", 3);
		double SubB = Double.parseDouble(SSubB);
		double SAnswer = SubA - SubB;
		JOptionPane.showMessageDialog(null, SAnswer,"The Answer", 1);
		
		String SAddA = JOptionPane.showInputDialog(null, "Enter the first number to be added", "Enter a number", 3);
		double AddA = Double.parseDouble(SAddA);
		String SAddB = JOptionPane.showInputDialog(null, "Enter the second number to be added", "Enter a Number", 3);
		double AddB = Double.parseDouble(SAddB);
		double AAnswer = AddA + AddB;
		JOptionPane.showMessageDialog(null, AAnswer,"The Answer", 1);
		JOptionPane.showMessageDialog(null, "Program Will Now Close", "End Of Project", 0);
	}

}