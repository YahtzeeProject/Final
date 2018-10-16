package Levels;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class level2 {
	
 

	public static void level2() {
		// TODO Auto-generated method stub
		Words.words2normal.words2();
		String message;
		
		Scanner input  = new Scanner(System.in);
					 
					 do {
						 
						 message=JOptionPane.showInputDialog(null, Words.words2normal.words2[0]);
						 
						 if (Words.words2normal.ans2[0].equals(message))
							{
							 JOptionPane.showMessageDialog(null, "Good Job, Next Question!");
							}
						else if(!Words.words2normal.ans2[0].equals(message))
							{
							JOptionPane.showMessageDialog(null, "Sorry, Try Again.");
							}
						else
							{
								System.out.println("Invalid");
							}
					 }while(!Words.words2normal.ans2[0].equals(message));
					 
					 
					 
					 do {
						 
						 message=JOptionPane.showInputDialog(null, Words.words2normal.words2[1]);
						 
						 if (Words.words2normal.ans2[1].equals(message))
							{
							 JOptionPane.showMessageDialog(null, "Good Job, Next Question!");
							}
						else if(!Words.words2normal.ans2[1].equals(message))
							{
							JOptionPane.showMessageDialog(null, "Sorry, Try Again.");
							}
						else
							{
								System.out.println("Invalid");
							}
					 }while(!Words.words2normal.ans2[1].equals(message));
					 
					
					 
					 do {
						 
						 message=JOptionPane.showInputDialog(null, Words.words2normal.words2[2]);
						 
						 if (Words.words2normal.ans2[2].equals(message))
							{
							 JOptionPane.showMessageDialog(null, "Good Job, Next Question!");
							}
						else if(!Words.words2normal.ans2[2].equals(message))
							{
							JOptionPane.showMessageDialog(null, "Sorry, Try Again.");
							}
						else
							{
								System.out.println("Invalid");
							}
					 }while(!Words.words2normal.ans2[2].equals(message));
					 
					
					 
					 do {
						 
						 message=JOptionPane.showInputDialog(null, Words.words2normal.words2[3]);
						 
						 if (Words.words2normal.ans2[3].equals(message))
							{
							 JOptionPane.showMessageDialog(null, "Good Job, Next Question!");
							}
						else if(!Words.words2normal.ans2[3].equals(message))
							{
							JOptionPane.showMessageDialog(null, "Sorry, Try Again.");
							}
						else
							{
								System.out.println("Invalid");
							}
					 }while(!Words.words2normal.ans2[3].equals(message));
					 
					 
					 
					 do {
						 
						 message=JOptionPane.showInputDialog(null, Words.words2normal.words2[4]);
						 
						 if (Words.words2normal.ans2[4].equals(message))
							{
							 JOptionPane.showMessageDialog(null, "Good Job, You beat level 1!");
							}
						else if(!Words.words2normal.ans2[4].equals(message))
							{
							JOptionPane.showMessageDialog(null, "Sorry, Try Again.");
							}
						else
							{
								System.out.println("Invalid");
							}
					 }while(!Words.words2normal.ans2[4].equals(message));

					 JOptionPane.showInputDialog(null,"You are Done with the GAME.");
	}
	
		
	}


