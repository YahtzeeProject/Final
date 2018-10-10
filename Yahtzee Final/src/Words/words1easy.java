package Words;

public class Words1Easy {

	public static void words() {
		
		// TODO Auto-generated method stub
		
		int random = (int )(Math.random() * 10 + 1);
		String[] words = new String[5];
		
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

		for (int i = 0; i < words.length; i++) {
		if (random == 1)
		{
			words[i] = Party;
		}
		else if (random == 2)
		{
			words[i] = Loop;
		}
		else if (random == 3)
		{
			words[i] = Airplane;
		}
		else if (random == 4)
		{
			words[i] = Balloon;
		}
		else if (random == 5)
		{
			words[i] = Bee;
		}
		else if (random == 6)
		{
			words[i] = Bomb;
		}
		else if (random == 7)
		{
			words[i] = Chef;
		}
		else if (random == 8)
		{
			words[i] = Drink;
		}
		else if (random == 9)
		{
			words[i] = Egg;
		}
		else if (random == 10)
		{
			words[i] = Fan;
		}
		}
		
	}

}
