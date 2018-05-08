package randomMath;

import javax.swing.JOptionPane;

public class RandomMath {
	/**
	 * @author marcus8448
	 * Version 5.0.0
	 */
	public static void Multiply() {
		
		String SMultiA = JOptionPane.showInputDialog(null, "Enter the first number to be multiplied", "Enter a number", 3);
		if (SMultiA == null) {
			errorNoEntry();
		}
		double MultiA = Double.parseDouble(SMultiA);
		String SMultiB = JOptionPane.showInputDialog(null, "Enter the second number to be multiplied", "Enter a Number", 3);
		double MultiB = Double.parseDouble(SMultiB);
		double MAnswer = MultiA * MultiB;
		JOptionPane.showMessageDialog(null, MAnswer + "   How we got the answer: ("  + MultiA + " * " + MultiB + " = " + MAnswer + ")","The Answer", 1); 
		start();
	}
	public static void Divide() {
		String SDivA = JOptionPane.showInputDialog(null, "Enter the first number to be divided", "Enter a number", 3);
		double DivA = Double.parseDouble(SDivA);
		String SDivB = JOptionPane.showInputDialog(null, "Enter the second number to be divided", "Enter a Number", 3);
		double DivB = Double.parseDouble(SDivB);
		double DAnswer = DivA / DivB;
		JOptionPane.showMessageDialog(null, DAnswer + "   How we got the answer: ("  + DivA + " / " + DivB + " = " + DAnswer + ")","The Answer", 1);
		start();
	}
	public static void Subtract() {
		String SSubA = JOptionPane.showInputDialog(null, "Enter the first number to be subtracted", "Enter a number", 3);
		double SubA = Double.parseDouble(SSubA);
		String SSubB = JOptionPane.showInputDialog(null, "Enter the second number to be subtracted", "Enter a Number", 3);
		double SubB = Double.parseDouble(SSubB);
		double SAnswer = SubA - SubB;
		JOptionPane.showMessageDialog(null, SAnswer + "   How we got the answer: ("  + SubA + " - " + SubB + " = " + SAnswer + ")","The Answer", 1);
		start();
	}
	public static void Add() { 		
		String SAddA = JOptionPane.showInputDialog(null, "Enter the first number to be added", "Enter a number", 3);
		double AddA = Double.parseDouble(SAddA);
		String SAddB = JOptionPane.showInputDialog(null, "Enter the second number to be added", "Enter a Number", 3);
		double AddB = Double.parseDouble(SAddB);
		double AAnswer = AddA + AddB;
		JOptionPane.showMessageDialog(null, AAnswer + "    How we got the answer: (" + AddA + " + " + AddB + " = " + AAnswer + ")","The Answer", 1);
		start();
	}
	public static void about() {
		JOptionPane.showMessageDialog(null, "You are running " + Constants.VERSIONNAMEFULL + " A.K.A. Version " + Constants.VERSIONBASE + "." + Constants.VERSIONADDITION1 + "." + Constants.VERSIONADDITION2 + "By: " + Constants.CurrentAuthor,"Info", 1);
		start();
	}
	public static void errorCancel() {
		JOptionPane.showMessageDialog(null, "Why did you close the Window / Press Cancel?!?!?!?!? To properly stop the program press '5'","Error", 2);
		start();
	}
	public static void errorNoEntry() {
		JOptionPane.showMessageDialog(null, "You must type a number!","Error", 2);
		start();
	}
	public static void errorMaxSize() {
		JOptionPane.showMessageDialog(null, "Your number is too long! It must be 10 characters and below (Including -'s)","Error", 2);
		start();
	}
	public static void errorInvalidChars() {
		JOptionPane.showMessageDialog(null, "Invalid characters in your answer","Error", 2);
		start();
	}
	public static void start() {
		String OpChooseS = JOptionPane.showInputDialog(null, "Enter '1' to Multiply, '2' to Divide, '3' to Subtract, '4' to Add, '5' to end the program and '6' to see QuickMeth INFO.", "Enter a number from 1 - 5", 3);
		if (OpChooseS == null || OpChooseS != null && ("".equals(OpChooseS))) {
			errorCancel();
		} else {
			if (OpChooseS.length() < 1) {
				errorNoEntry();
			} else {
				if (OpChooseS.matches(".*[:-~].*")) { 
					errorInvalidChars();
				} else {
					if (OpChooseS.matches(".*[!-/].*")) {
						errorInvalidChars();
					} else {
						if (OpChooseS.length() > 10) {
							errorMaxSize();
						} else {
							if (OpChooseS == "5") {
								JOptionPane.showMessageDialog(null, "Quick Meth Version " + Constants.VERSIONBASE + " Will Now Close", "End Of Project", 0);
							}
						}
					}
				}
			}
		}
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
						if (OpChooseI > 6) {
							errorInvalidChars();
						} else {
							if (OpChooseI < 1) {
								errorInvalidChars();
							} else {
								if (OpChooseI == 6) {
									about();
								}
							}
						}
					}
				}
			}
		}
	}
	public static void main(String[] args)  {
		JOptionPane.showMessageDialog(null, "Quick Meth Version " + Constants.VERSIONBASE + "." + Constants.VERSIONADDITION1 + "." + Constants.VERSIONADDITION2 + " Created By: " + Constants.CurrentAuthor, "About", 1);
		start();
	}

}