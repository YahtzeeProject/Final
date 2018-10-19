package Levels;

import java.util.Scanner;// Lets us import scanner

import javax.swing.JOptionPane;// Lets us use GUIs

public class level2 {
	
	public static int count = 0;

	public static void level2() {
		// TODO Auto-generated method stub
		Words.words2normal.words2();
		String message;
		
		
		Scanner input  = new Scanner(System.in);// Lets us scan user input.
					 
					 do {
						
						 message = JOptionPane.showInputDialog(null, Words.words2normal.words2[0]);
						 
						 if (Words.words2normal.ans2[0].equals(message))
							{
							 JOptionPane.showMessageDialog(null, "Good Job, Next Question!");
							}
						else if(!Words.words2normal.ans2[0].equals(message))
							{
							JOptionPane.showMessageDialog(null, "Sorry, Try Again.");
							JOptionPane.showMessageDialog(null,Words.words2normal.hint2[0]);
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
							JOptionPane.showMessageDialog(null,Words.words2normal.hint2[1]);
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
							JOptionPane.showMessageDialog(null,Words.words2normal.hint2[2]);
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
							JOptionPane.showMessageDialog(null,Words.words2normal.hint2[3]);
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
							 JOptionPane.showMessageDialog(null, "Good Job, Next Question");
							}
						else if(!Words.words2normal.ans2[4].equals(message))
							{
							JOptionPane.showMessageDialog(null, "Sorry, Try Again.");
							JOptionPane.showMessageDialog(null,Words.words2normal.hint2[4]);
							}
						else
							{
								System.out.println("Invalid");
							}
					 }while(!Words.words2normal.ans2[4].equals(message));
					 
					 do {
						 
						 message=JOptionPane.showInputDialog(null, Words.words2normal.words2[5]);
						 
						 if (Words.words2normal.ans2[5].equals(message))
							{
							 JOptionPane.showMessageDialog(null, "Good Job, Next Question");
							}
						else if(!Words.words2normal.ans2[5].equals(message))
							{
							JOptionPane.showMessageDialog(null, "Sorry, Try Again.");
							JOptionPane.showMessageDialog(null,Words.words2normal.hint2[5]);
							}
						else
							{
								System.out.println("Invalid");
							}
					 }while(!Words.words2normal.ans2[5].equals(message));
					 
					 do {
						 
						 message=JOptionPane.showInputDialog(null, Words.words2normal.words2[6]);
						 
						 if (Words.words2normal.ans2[6].equals(message))
							{
							 JOptionPane.showMessageDialog(null, "Good Job, Next Question");
							}
						else if(!Words.words2normal.ans2[6].equals(message))
							{
							JOptionPane.showMessageDialog(null, "Sorry, Try Again.");
							JOptionPane.showMessageDialog(null,Words.words2normal.hint2[6]);

							}
						else
							{
								System.out.println("Invalid");
							}
					 }while(!Words.words2normal.ans2[6].equals(message));

					 JOptionPane.showInputDialog(null,"You are Done with the GAME.");
					 
/*					 for (int l = 0; l < Words.words2normal.words2.length; l++)
					 {
						 do {
							 
							 message=JOptionPane.showInputDialog(null, Words.words2normal.words2[l]);
							 
							 if (Words.words2normal.ans2[l].equals(message))
								{
								 JOptionPane.showMessageDialog(null, "Good Job, Next Question");
								}
							else if(!Words.words2normal.ans2[l].equals(message))
								{
								JOptionPane.showMessageDialog(null, "Sorry, Try Again.");
								JOptionPane.showMessageDialog(null,Words.words2normal.hint2[l]);

								}
							else
								{
									System.out.println("Invalid");
								}
						 }while(!Words.words2normal.ans2[l].equals(message));
					 }*/
	}
	
		
	}


