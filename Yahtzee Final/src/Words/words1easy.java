package Words;

public class words1easy {
	public static String[] words = new String[5];
	
	public static String[] ans = new String[5];
	
	public static String[] hint = new String[5];
	
	public static void words() {
		
		// TODO Auto-generated method stub
		
		String[] define = { "A type of celebration!", "A repeated circle.", "A machine that can fly.", "A ball with helium.", "Bzzz Bzzzz.","Terrorists use this.","They cook food.","Something you do to liquids.","Chickens lay these." , "Blows air."};  
		
		String Partyhint = "P _ _ _ y";
		 String Loophint = "L _ _ p";
		String Airplanehint = "A _ _ _ _ _ _ e";
		String Balloonhint = "B _ _ _ _ _ n"; 
		 String Beehint = "B _ _";
		 String Bombhint = "B _ _ b";
		 String Chefhint = "C _ _ f" ;
		 String Drinkhint = "D _ _ _ k";
		 String Egghint = "E _ _ s";
		 String Fanhint = "F _ _ ";
		
		 String PartyAns = "Party";
		 String LoopAns = "Loop";
		String AirplaneAns = "Airplane";
		String BalloonAns = "Balloon";
		 String BeeAns = "Bee";
		 String BombAns = "Bomb";
		 String ChefAns = "Chef";
		 String DrinkAns = "Drink";
		 String EggAns = "Eggs";
		 String FanAns = "Fan";
		
		

		for (int i = 0; i < words.length; i++) {
		
			int random = (int )(Math.random() * 10 + 1);
				
			if (random == 1)
				
			{
				words[i] = define[0];
				ans[i] = PartyAns;
				hint[i] = Partyhint;
			}
			else if (random == 2)
			{
				words[i] = define[1];
				hint[i] = Loophint;
				ans[i] = LoopAns;
			}
			else if (random == 3)
			{
				words[i] = define[2];
				ans[i] = AirplaneAns;
				hint[i] = Airplanehint;
			}
			else if (random == 4)
			{
				words[i] = define[3];
				ans[i] = BalloonAns;
				hint[i] = Balloonhint;
			}
			else if (random == 5)
			{
				words[i] = define[4];
				hint[i] = Beehint;
				ans[i] = BeeAns;
			}
			else if (random == 6)
			{
				words[i] = define[5];
				ans[i] = BombAns;
				hint[i] = Bombhint;
			}
			else if (random == 7)
			{
				words[i] = define[6];
				ans[i] = ChefAns;
				hint[i] = Chefhint;
			}
			else if (random == 8)
			{
				words[i] = define[7];
				ans[i] = DrinkAns;
				hint[i] = Drinkhint;
			}
			else if (random == 9)
			{
				words[i] = define[8];
				hint[i] = Egghint;
				ans[i] = EggAns;
			}
			else if (random == 10)
			{
				words[i] = define[9];
				ans[i] = FanAns;
				hint[i] = Fanhint;
			}
		}
		for (int l = 0; l < ans.length; l++)
		{
	

				if (words[0] == define[0])
					
				{
					ans[0] = PartyAns;  
				}
				else if (words[0] == define[1])
					
				{
					ans[0] = LoopAns;  
				}
				else if (words[0] == define[2])
					
				{
					ans[0] = AirplaneAns;  
				}
				else if (words[0] == define[3])
				
				{
					ans[0] = BalloonAns;  
				}
				else if (words[0] == define[4])
					
				{
					ans[0] = BeeAns;  
				}
				else if (words[0] == define[5])
					
				{
					ans[0] = BombAns;  
				}
				else if (words[0] == define[6])
				
				{
					ans[0] = ChefAns;  
				}
				else if (words[0] == define[7])
					
				{
					ans[0] = DrinkAns;  
				}			
				else if (words[0] == define[8])
				
				{
					ans[0] = EggAns;  
				}
				else if (words[0] == define[9])
					
				{
					ans[0] = FanAns;  
				}
				else if (words[1] == define[0])
					
				{
					ans[1] = PartyAns;  
				}
				else if (words[1] == define[1])
					
				{
					ans[1] = LoopAns;  
				}
				else if (words[1] == define[2])
					
				{
					ans[1] = AirplaneAns;  
				}
				else if (words[1] == define[3])
				
				{
					ans[1] = BalloonAns;  
				}
				else if (words[1] == define[4])
					
				{
					ans[1] = BeeAns;  
				}
				else if (words[1] == define[5])
					
				{
					ans[1] = BombAns;  
				}
				else if (words[1] == define[6])
				
				{
					ans[1] = ChefAns;  
				}
				else if (words[1] == define[7])
					
				{
					ans[1] = DrinkAns;  
				}			
				else if (words[1] == define[8])
				
				{
					ans[1] = EggAns;  
				}
				else if (words[1] == define[9])
					
				{
					ans[1] = FanAns;  
				}
				else if (words[2] == define[0])
					
				{
					ans[2] = PartyAns;  
				}
				else if (words[2] == define[1])
					
				{
					ans[2] = LoopAns;  
				}
				else if (words[2] == define[2])
					
				{
					ans[2] = AirplaneAns;  
				}
				else if (words[2] == define[3])
				
				{
					ans[2] = BalloonAns;  
				}
				else if (words[2] == define[4])
					
				{
					ans[2] = BeeAns;  
				}
				else if (words[2] == define[5])
					
				{
					ans[2] = BombAns;  
				}
				else if (words[2] == define[6])
				
				{
					ans[2] = ChefAns;  
				}
				else if (words[2] == define[7])
					
				{
					ans[2] = DrinkAns;  
				}			
				else if (words[2] == define[8])
				
				{
					ans[2] = EggAns;  
				}
				else if (words[2] == define[9])
					
				{
					ans[2] = FanAns;  
				}
				if (words[3] == define[0])
					
				{
					ans[3] = PartyAns;  
				}
				else if (words[3] == define[1])
					
				{
					ans[3] = LoopAns;  
				}
				else if (words[3] == define[2])
					
				{
					ans[3] = AirplaneAns;  
				}
				else if (words[3] == define[3])
				
				{
					ans[3] = BalloonAns;  
				}
				else if (words[3] == define[4])
					
				{
					ans[3] = BeeAns;  
				}
				else if (words[3] == define[5])
					
				{
					ans[3] = BombAns;  
				}
				else if (words[3] == define[6])
				
				{
					ans[3] = ChefAns;  
				}
				else if (words[3] == define[7])
					
				{
					ans[3] = DrinkAns;  
				}			
				else if (words[3] == define[8])
				
				{
					ans[3] = EggAns;  
				}
				else if (words[3] == define[9])
					
				{
					ans[3] = FanAns;  
				}
				if (words[4] == define[0])
					
				{
					ans[4] = PartyAns;  
				}
				else if (words[4] == define[1])
					
				{
					ans[4] = LoopAns;  
				}
				else if (words[4] == define[2])
					
				{
					ans[4] = AirplaneAns;  
				}
				else if (words[4] == define[3])
				
				{
					ans[4] = BalloonAns;  
				}
				else if (words[4] == define[4])
					
				{
					ans[4] = BeeAns;  
				}
				else if (words[4] == define[5])
					
				{
					ans[4] = BombAns;  
				}
				else if (words[4] == define[6])
				
				{
					ans[4] = ChefAns;  
				}
				else if (words[4] == define[7])
					
				{
					ans[4] = DrinkAns;  
				}			
				else if (words[4] == define[8])
				
				{
					ans[4] = EggAns;  
				}
				else if (words[4] == define[9])
					
				{
					ans[4] = FanAns;  
				}
		}
		

		}
	}


