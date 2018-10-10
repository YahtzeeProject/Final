package Words;

public class words1easy {
	public static String[] words = new String[5];
	
	public static String[] ans = new String[5];
	
	public static String PartyAns = "Party";
	public static String LoopAns = "Loop";
	public static String AirplaneAns = "Airplane";
	public static String BalloonAns = "Balloon";
	public static String BeeAns = "Bee";
	public static String BombAns = "Bomb";
	public static String ChefAns = "Chef";
	public static String DrinkAns = "Drink";
	public static String EggAns = "Eggs";
	public static String FanAns = "Fan";
	
	public static void words() {
		
		// TODO Auto-generated method stub
		
		String[] define = { "A type of celebration!", "A repeated circle.", "A machine that can fly.", "A ball with helium.", "Bzzz Bzzzz.","Terrorists use this.","They cook food.","Something you do to liquids.","Chickens lay these." , "Blows air."};  
		
		
		

		for (int i = 0; i < words.length; i++) {
		
			int random = (int )(Math.random() * 10 + 1);
			
			if (random == 1)
			
		{
			words[i] = define[0];
		}
		else if (random == 2)
		{
			words[i] = define[1];
		}
		else if (random == 3)
		{
			words[i] = define[2];
		}
		else if (random == 4)
		{
			words[i] = define[3];
		}
		else if (random == 5)
		{
			words[i] = define[4];
		}
		else if (random == 6)
		{
			words[i] = define[5];
		}
		else if (random == 7)
		{
			words[i] = define[6];
		}
		else if (random == 8)
		{
			words[i] = define[7];
		}
		else if (random == 9)
		{
			words[i] = define[8];
		}
		else if (random == 10)
		{
			words[i] = define[9];
		}
		}
		
	}

}
