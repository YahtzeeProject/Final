package Words;

public class Words1Easy {
	public static String[] words2 = new String[5];
	public static void words() {
		
		// TODO Auto-generated method stub
		
		
		
		
		String Answer;
		String Party = "A type of celebration!";
		String Loop = "A repeated circle.";
		String Airplane = "A machine that can fly.";
		String Balloon = "A ball with helium.";
		String Bee = "Bzzz Bzzzz.";
		String Bomb = "Terrorists use this.";
		String Chef = "They cook food.";
		String Drink = "Something you do to liquids.";
		String Egg = "Chickens lay these.";
		String Fan = "Blows air.";

		for (int i = 0; i < words2.length; i++) {
		
			int random = (int )(Math.random() * 10 + 1);
			
			if (random == 1)
		{
			words2[i] = Party;
		}
		else if (random == 2)
		{
			words2[i] = Loop;
		}
		else if (random == 3)
		{
			words2[i] = Airplane;
		}
		else if (random == 4)
		{
			words2[i] = Balloon;
		}
		else if (random == 5)
		{
			words2[i] = Bee;
		}
		else if (random == 6)
		{
			words2[i] = Bomb;
		}
		else if (random == 7)
		{
			words2[i] = Chef;
		}
		else if (random == 8)
		{
			words2[i] = Drink;
		}
		else if (random == 9)
		{
			words2[i] = Egg;
		}
		else if (random == 10)
		{
			words2[i] = Fan;
		}
		}
		
	}

}
