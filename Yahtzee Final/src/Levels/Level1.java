package Levels;

import javax.swing.*;

public class Level1 {


	public static void main(String[] args) {
		
		Words.words1easy.words();
		String message;
			
			
		do {
			message =  JOptionPane.showInputDialog(null, Words.words1easy.words[0]);

		}while(!message.equals(Words.words1easy.PartyAns) || !message.equals(Words.words1easy.BeeAns) || !message.equals(Words.words1easy.DrinkAns) || !message.equals(Words.words1easy.BeeAns) || !message.equals(Words.words1easy.FanAns) || !message.equals(Words.words1easy.EggAns) || !message.equals(Words.words1easy.BombAns) || !message.equals(Words.words1easy.ChefAns) || !message.equals(Words.words1easy.LoopAns) || !message.equals(Words.words1easy.AirplaneAns));
		


	}
	

}
