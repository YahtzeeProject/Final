package Levels;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
import java.util.Scanner;


public class Level1 {


	public static void main(String[] args) {
		
		Words.words1easy.words();
		String message;
		
		
		
		Object[] options = {"Party",
                "Loop",
                "Airplane",
                "Balloon",
                "Bee",
                "Bomb",
                "Chef",
                "Drink",
                "Eggs",
                "Fan"};
		
		Scanner input  = new Scanner(System.in);

				
/*					int n = JOptionPane.showOptionDialog(null,//parent container of JOptionPane
							Words.words1easy.words[0],
					"Words Q1",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,//do not use a custom Icon
					options,//the titles of buttons
					options[2]);//default button title
*/					
					System.out.println(Words.words1easy.ans[0]);
					System.out.println(Words.words1easy.words[0]);

					message=JOptionPane.showInputDialog(null, Words.words1easy.words[0]);
					 
					 do {
						 if (Words.words1easy.ans[0].equals(message))
							{
							 JOptionPane.showMessageDialog(null, "Good Job, Next Question!");
							}
						else if(!Words.words1easy.ans[0].equals(message))
							{
							JOptionPane.showMessageDialog(null, "Sorry, Try Again.");
							}
						else
							{
								System.out.println("Invalid");
							}
					 }while(!Words.words1easy.ans[0].equals(message));
					 
					 message=JOptionPane.showInputDialog(null, Words.words1easy.words[1]);
					 
					 do {
						 if (Words.words1easy.ans[1].equals(message))
							{
							 JOptionPane.showMessageDialog(null, "Good Job, Next Question!");
							}
						else if(!Words.words1easy.ans[1].equals(message))
							{
							JOptionPane.showMessageDialog(null, "Sorry, Try Again.");
							}
						else
							{
								System.out.println("Invalid");
							}
					 }while(!Words.words1easy.ans[1].equals(message));
					 
					 message=JOptionPane.showInputDialog(null, Words.words1easy.words[2]);
					 
					 do {
						 if (Words.words1easy.ans[2].equals(message))
							{
							 JOptionPane.showMessageDialog(null, "Good Job, Next Question!");
							}
						else if(!Words.words1easy.ans[2].equals(message))
							{
							JOptionPane.showMessageDialog(null, "Sorry, Try Again.");
							}
						else
							{
								System.out.println("Invalid");
							}
					 }while(!Words.words1easy.ans[2].equals(message));
					 
					 message=JOptionPane.showInputDialog(null, Words.words1easy.words[3]);
					 
					 do {
						 if (Words.words1easy.ans[3].equals(message))
							{
							 JOptionPane.showMessageDialog(null, "Good Job, Next Question!");
							}
						else if(!Words.words1easy.ans[3].equals(message))
							{
							JOptionPane.showMessageDialog(null, "Sorry, Try Again.");
							}
						else
							{
								System.out.println("Invalid");
							}
					 }while(!Words.words1easy.ans[3].equals(message));
					 
					 message=JOptionPane.showInputDialog(null, Words.words1easy.words[4]);
					 
					 do {
						 if (Words.words1easy.ans[4].equals(message))
							{
							 JOptionPane.showMessageDialog(null, "Good Job, You beat level 1!");
							}
						else if(!Words.words1easy.ans[4].equals(message))
							{
							JOptionPane.showMessageDialog(null, "Sorry, Try Again.");
							}
						else
							{
								System.out.println("Invalid");
							}
					 }while(!Words.words1easy.ans[4].equals(message));


	}
	

}
