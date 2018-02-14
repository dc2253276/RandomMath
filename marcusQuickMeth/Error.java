package marcusQuickMeth;

import javax.swing.JOptionPane;

public class Error {
	public static void Cancel() {
		JOptionPane.showMessageDialog(null, "You cannot close the window / press cancel. To properly stop the program press '5'","Error", 2);
		QuickMeth.start();
	}
	public static void NoEntry() {
		JOptionPane.showMessageDialog(null, "You must type a number!","Error", 2);
		QuickMeth.start();
	}
	public static void MaxSize() {
		JOptionPane.showMessageDialog(null, "Your number is too long! It must be 10 characters and below (Including negatives)","Error", 2);
		QuickMeth.start();
	}
	public static void InvalidChars() {
		JOptionPane.showMessageDialog(null, "Invalid characters in your answer","Error", 2);
		QuickMeth.start();
	}
	public static void Unknown() {
		JOptionPane.showMessageDialog(null, "Unknown error, please contact the developer","Error", 2);
		QuickMeth.start();
	}
}
