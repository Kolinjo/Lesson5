package optional;

import javax.swing.JOptionPane;

public class Platypus {
	private String name;

	Platypus(String name) {
		this.name = name;
	}

	Platypus() {
		String name = JOptionPane.showInputDialog("Give you platypus a name:");
		JOptionPane.showConfirmDialog(null, "Your platypus has a name of " + name);

	}

	void sayHi() {
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}

	public static void main(String[] args) {
		// 1. Make an instance of your new pet platypus
		Platypus platypus = new Platypus("Marko");

		// 2. Call the sayHi method
		platypus.sayHi();

		// 3. Create a constructor in the platypus class so that you can give your
		// platypus a name.
		Platypus platypus1 = new Platypus();
	}
}
