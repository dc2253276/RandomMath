package randomMath;

import javax.swing.JOptionPane;
import randomMath.Math;
import randomMath.Constants;
import randomMath.Error;
/**
 * @author marcus8448
 * Version 7.0.0
 */
public class RandomMath {

	
	/**
	 * Call this to multiply
	 * @return start();
	 */
	@Math
	protected static void Multiply() {
		double MultiA = 0;
		double MultiB = 0;
		String SMultiA = JOptionPane.showInputDialog(null, "Enter the first number to be multiplied", "Enter a number", 3);
		try {
			MultiA = Double.parseDouble(SMultiA);
		} catch (NumberFormatException Exception) {
			Error.NoEntry();
		}
		String SMultiB = JOptionPane.showInputDialog(null, "Enter the second number to be multiplied", "Enter a Number", 3);
		try {
			MultiB = Double.parseDouble(SMultiB);
		} catch (NumberFormatException Exception) {
			Error.NoEntry();
		};
		double MAnswer = MultiA * MultiB;
		JOptionPane.showMessageDialog(null, MAnswer + "   How we got the answer: ("  + MultiA + " * " + MultiB + " = " + MAnswer + ")","The Answer", 1); 
		start();
	}
	
	/**
	 * Call this to divide
	 * @return start();
	 */
	@Math
	protected static void Divide() {
		double DivA = 0;
		double DivB = 0;
		String SDivA = JOptionPane.showInputDialog(null, "Enter the first number to be divided", "Enter a number", 3);
		try {
		DivA = Double.parseDouble(SDivA);
		} catch (NumberFormatException Exception){
			Error.NoEntry();
		} 
		String SDivB = JOptionPane.showInputDialog(null, "Enter the second number to be divided", "Enter a Number", 3);
		DivB = Double.parseDouble(SDivB);
		double DAnswer = DivA / DivB;
		JOptionPane.showMessageDialog(null, DAnswer + "   How we got the answer: ("  + DivA + " / " + DivB + " = " + DAnswer + ")","The Answer", 1);
		start();
	}
	/**
	 * Call this to subtract
	 * @return start();
	 */
	@Math
	protected static void Subtract() {
		double SubA = 0;
		double SubB = 0;
		String SSubA = JOptionPane.showInputDialog(null, "Enter the first number to be subtracted", "Enter a number", 3);
		try {
		SubA = Double.parseDouble(SSubA);
		} catch (NumberFormatException Exception){
			Error.NoEntry();
		}
		String SSubB = JOptionPane.showInputDialog(null, "Enter the second number to be subtracted", "Enter a Number", 3);
		try {
		SubB = Double.parseDouble(SSubB);
		} catch (NumberFormatException Exception) {
			Error.NoEntry();
		}
		double SAnswer = SubA - SubB;
		JOptionPane.showMessageDialog(null, SAnswer + "   How we got the answer: ("  + SubA + " - " + SubB + " = " + SAnswer + ")","The Answer", 1);
		start();
	}
	/**
	 * Call this to add
	 * @return start();
	 */
	@Math
	protected static void Add() { 	
		double AddA = 0;
		double AddB = 0;
		String SAddA = JOptionPane.showInputDialog(null, "Enter the first number to be added", "Enter a number", 3);
		try {
		AddA = Double.parseDouble(SAddA);
		} catch (NumberFormatException Exception) {
			Error.NoEntry();
		}
		String SAddB = JOptionPane.showInputDialog(null, "Enter the second number to be added", "Enter a Number", 3);
		try {
			AddB = Double.parseDouble(SAddB);
		} catch (NumberFormatException Exception) {
			Error.NoEntry();
		}
		double AAnswer = AddA + AddB;
		JOptionPane.showMessageDialog(null, AAnswer + "    How we got the answer: (" + AddA + " + " + AddB + " = " + AAnswer + ")","The Answer", 1);
		start();
	}
	/**
	 * Use the custom error messages 
	 # @see Error#InvalidNumber
	 */
	@Deprecated
	public static void error() {
		JOptionPane.showMessageDialog(null, "Please enter somthing else","Error", 2);
		start();
	}
	/**
	 * To end
	 */
	public static void end() {
		JOptionPane.showMessageDialog(null, "RandomMath Version " + Constants.VERSIONBASE + " Will Now Close", "End Of Project", 0);
		System.exit(0);
	}
	/**
	 * Info about the currently in use release of RandomMath
	 */
	public static void about() {
		JOptionPane.showMessageDialog(null, "You are running " + Constants.VERSIONNAMEFULL + " A.K.A. Version " + Constants.VERSIONBASE + "." + Constants.VERSIONADDITION1 + "." + Constants.VERSIONADDITION2 + "By: " + Constants.CurrentAuthor,"Info", 1);
		start();
	}
	

	public static void start() {
		int OpChooseI = 0;
		String OpChooseS = JOptionPane.showInputDialog(null, "Enter '1' to Multiply, '2' to Divide, '3' to Subtract, '4' to Add, '5' to end the program and '6' to see RandomMath INFO.", "Enter a number from 1 - 6", 3);
		try {
			OpChooseI = Integer.parseInt(OpChooseS);
		} catch (NumberFormatException Exception) {
			Error.InvalidNumber();
		}
			if (OpChooseI < 1) {
				start();
			} else {
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
								if (OpChooseI == 5) {
									end();
								} else {
									if (OpChooseI == 6) {
										about();
									} else {
										if (OpChooseI > 6) {
											Error.MaxAmount();
										} 
									}
								}
							}
						}
					}
				}
			}
		}
			
	
	public static void main(String[] args)  {
		JOptionPane.showMessageDialog(null, "RandomMath Version " + Constants.VERSIONBASE + "." + Constants.VERSIONADDITION1 + "." + Constants.VERSIONADDITION2 + " Created By: " + Constants.CurrentAuthor, "About", 1);
		start();
	}

}