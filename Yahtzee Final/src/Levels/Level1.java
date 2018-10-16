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
		
		Scanner input  = new Scanner(System.in);

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

					 message=JOptionPane.showInputDialog(null,"Would You like to play level 2?");
	}
	

}
