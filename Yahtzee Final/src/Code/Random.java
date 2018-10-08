package Code;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] randNum = new int[5];
		int selectDice;
		int count = 0;
		
		Scanner input  = new Scanner(System.in);
		
		for (int i = 0; i< randNum.length; i++)
		{
			randNum[i] = 1 + (int)(Math.random() * 6);
			count++;
			System.out.println(count + " - " + randNum[i]);
			
		}
		
		System.out.println("Which Die would you hold?");
		
		
	}

}
