package marcusQuickMeth;

import javax.swing.JOptionPane;

public class QuickMeth {

	
	/**
	 * @author marcus8448
	 * Version 3.0.0
	 */
	public static void Multiply() {
		
		String SMultiA = JOptionPane.showInputDialog(null, "Enter the first number to be multiplied", "Enter a number", 3);
		double MultiA = Double.parseDouble(SMultiA);
		String SMultiB = JOptionPane.showInputDialog(null, "Enter the second number to be multiplied", "Enter a Number", 3);
		double MultiB = Double.parseDouble(SMultiB);
		double MAnswer = MultiA * MultiB;
		JOptionPane.showMessageDialog(null, MAnswer,"The Answer", 1); 
		start();
	}
	public static void Divide() {
		String SDivA = JOptionPane.showInputDialog(null, "Enter the first number to be divided", "Enter a number", 3);
		double DivA = Double.parseDouble(SDivA);
		String SDivB = JOptionPane.showInputDialog(null, "Enter the second number to be divided", "Enter a Number", 3);
		double DivB = Double.parseDouble(SDivB);
		double DAnswer = DivA / DivB;
		JOptionPane.showMessageDialog(null, DAnswer,"The Answer", 1);
		start();
	}
	public static void Subtract() {
		String SSubA = JOptionPane.showInputDialog(null, "Enter the first number to be subtracted", "Enter a number", 3);
		double SubA = Double.parseDouble(SSubA);
		String SSubB = JOptionPane.showInputDialog(null, "Enter the second number to be subtracted", "Enter a Number", 3);
		double SubB = Double.parseDouble(SSubB);
		double SAnswer = SubA - SubB;
		JOptionPane.showMessageDialog(null, SAnswer,"The Answer", 1);
		start();
	}
	public static void Add() { 		
		String SAddA = JOptionPane.showInputDialog(null, "Enter the first number to be added", "Enter a number", 3);
		double AddA = Double.parseDouble(SAddA);
		String SAddB = JOptionPane.showInputDialog(null, "Enter the second number to be added", "Enter a Number", 3);
		double AddB = Double.parseDouble(SAddB);
		double AAnswer = AddA + AddB;
		JOptionPane.showMessageDialog(null, AAnswer,"The Answer", 1);
		start();
	}
	public static void error() {
		JOptionPane.showMessageDialog(null, "Please enter another number","Error", 2);
		start();
	}
	public static void end() {
		JOptionPane.showMessageDialog(null, "Program Will Now Close", "End Of Project", 0);
	}
	public static void start() {
		String OpChooseS = JOptionPane.showInputDialog(null, "Enter '1' to Multiply, '2' to Divide, '3' to Subtract, '4' to Add, and '5' to end the program", "Enter a number", 3);
		int OpChooseI = Integer.parseInt(OpChooseS);
		if (OpChooseI == 1) {
			Multiply();
		} else {
			if (OpChooseI == 2) {
				Divide();
			} else {
				if (OpChooseI == 3) {
					Subtract();
				} else {
					if (OpChooseI == 4) {
						Add();
					} else {
						if (OpChooseI > 5) {
							error();
						} else {
							if (OpChooseI < 1) {
								error();
							} else {
								end();
							}
						}
					}
				}
			}
		}
	}
	public static void main(String[] args)  {
		JOptionPane.showMessageDialog(null, "Quick Meth Version 3.0.0 By Marcus", "About", 1);
		start();
	}

}