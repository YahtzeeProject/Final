package Main;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Levels.Level1.level1();
		
		 String message = JOptionPane.showInputDialog(null,"Would You like to play level 2?");
		
		 if ("Yes".equals(message))
		 {
			 Levels.level2.level2();
		 }
		 else if ("No".equals(message))
		 {
			 JOptionPane.showInputDialog(null,"Thank you for playing!");
		 }
		 else
		 {
			 JOptionPane.showInputDialog(null,"PLS STOP!!!");
		 }
	
		
	}

}




