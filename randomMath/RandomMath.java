package randomMath;

import javax.swing.JOptionPane;
import randomMath.Math;
import randomMath.Constants;
import randomMath.Error;
/**
 * @author marcus8448
 * Version 6.0.1
 */
public class RandomMath {

	/**
	 * Call this to multiply
	 */
	@Math
	protected static void Multiply() {
		String SMultiA = JOptionPane.showInputDialog(null, "Enter the first number to be multiplied", "Enter a number", 3);
		if (SMultiA == null) {
			Error.NoEntry();
		}
		double MultiA = Double.parseDouble(SMultiA);
		String SMultiB = JOptionPane.showInputDialog(null, "Enter the second number to be multiplied", "Enter a Number", 3);
		double MultiB = Double.parseDouble(SMultiB);
		double MAnswer = MultiA * MultiB;
		JOptionPane.showMessageDialog(null, MAnswer + "   How we got the answer: ("  + MultiA + " * " + MultiB + " = " + MAnswer + ")","The Answer", 1); 
		start();
	}
	/**
	 * Call this to divide
	 */
	@Math
	protected static void Divide() {
		String SDivA = JOptionPane.showInputDialog(null, "Enter the first number to be divided", "Enter a number", 3);
		double DivA = Double.parseDouble(SDivA);
		String SDivB = JOptionPane.showInputDialog(null, "Enter the second number to be divided", "Enter a Number", 3);
		double DivB = Double.parseDouble(SDivB);
		double DAnswer = DivA / DivB;
		JOptionPane.showMessageDialog(null, DAnswer + "   How we got the answer: ("  + DivA + " / " + DivB + " = " + DAnswer + ")","The Answer", 1);
		start();
	}
	/**
	 * Call this to subtract
	 */
	@Math
	protected static void Subtract() {
		String SSubA = JOptionPane.showInputDialog(null, "Enter the first number to be subtracted", "Enter a number", 3);
		double SubA = Double.parseDouble(SSubA);
		String SSubB = JOptionPane.showInputDialog(null, "Enter the second number to be subtracted", "Enter a Number", 3);
		double SubB = Double.parseDouble(SSubB);
		double SAnswer = SubA - SubB;
		JOptionPane.showMessageDialog(null, SAnswer + "   How we got the answer: ("  + SubA + " - " + SubB + " = " + SAnswer + ")","The Answer", 1);
		start();
	}
	/**
	 * Call this to add
	 */
	@Math
	protected static void Add() { 		
		String SAddA = JOptionPane.showInputDialog(null, "Enter the first number to be added", "Enter a number", 3);
		double AddA = Double.parseDouble(SAddA);
		String SAddB = JOptionPane.showInputDialog(null, "Enter the second number to be added", "Enter a Number", 3);
		double AddB = Double.parseDouble(SAddB);
		double AAnswer = AddA + AddB;
		JOptionPane.showMessageDialog(null, AAnswer + "    How we got the answer: (" + AddA + " + " + AddB + " = " + AAnswer + ")","The Answer", 1);
		start();
	}
	/**
	 * Use the custom error messages see Error.InvalidChars
	 */
	@Deprecated
	public static void error() {
		JOptionPane.showMessageDialog(null, "Please enter valid number","Error", 2);
		start();
	}
	/**
	 * To end
	 */
	public static void end() {
		JOptionPane.showMessageDialog(null, "RandomMath Version " + Constants.VERSIONBASE + " Will Now Close", "End Of Project", 0);
		System.out.println("END");
	}
	public static void about() {
		JOptionPane.showMessageDialog(null, "You are running " + Constants.VERSIONNAMEFULL + " A.K.A. Version " + Constants.VERSIONBASE + "." + Constants.VERSIONADDITION1 + "." + Constants.VERSIONADDITION2 + "By: " + Constants.CurrentAuthor,"Info", 1);
		start();
	}
	public static void start() {
		String OpChooseS = JOptionPane.showInputDialog(null, "Enter '1' to Multiply, '2' to Divide, '3' to Subtract, '4' to Add, '5' to end the program and '6' to see RandomMath INFO.", "Enter a number from 1 - 5", 3);
		if (OpChooseS == null || OpChooseS != null && ("".equals(OpChooseS))) {
			Error.Cancel();
		} else {
			if (OpChooseS.length() < 1) {
				Error.NoEntry();
			} else {
				if (OpChooseS.matches(".*[:-~].*")) { 
					Error.InvalidChars();
				} else {
					if (OpChooseS.matches(".*[!-/].*")) {
						Error.InvalidChars();
					} else {
						if (OpChooseS.length() > 10) {
							Error.MaxSize();
						} else {
							if (OpChooseS == "5") {
								end();
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
							Error.InvalidChars();
						} else {
							if (OpChooseI < 1) {
								Error.InvalidChars();
							} else {
								if (OpChooseI == 6) {
									about();
								} else {
									if (OpChooseI == 5) {
										end();
									}
								}
							}
						}
					}
				}
			}
		}
	}
	@SuppressWarnings({ })
	public static void main(String[] args)  {
		JOptionPane.showMessageDialog(null, "Random Math Version " + Constants.VERSIONBASE + "." + Constants.VERSIONADDITION1 + "." + Constants.VERSIONADDITION2 + " Created By: " + Constants.CurrentAuthor, "About", 1);
		start();
	}

}