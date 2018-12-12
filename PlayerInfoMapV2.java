import java.util.*;

class HockeyPlayer{
	//fields
	private String lastName;
	private String position;
	private int jersey;
	
	//constructor
	public HockeyPlayer(String lastName, String position, int jersey){
		this.lastName = lastName;
		this.position = position;
		this.jersey = jersey;
	}
	
	//setters
	public void setLastName(String lastName){
		this.lastName = lastName;	
	}
	
	public void setPosition(String position){
		this.position = position;	
	}
	
	public void setJersey(int jersey){
		this.jersey = jersey;	
	}
	
	//getters
	public String getLastName(){
		return lastName;	
	}
	
	public String getPosition(){
		return position;	
	}
	
	public int getJersey(){
		return jersey;	
	}
	
	@Override
	public String toString(){
		return lastName + " | " + position + " | " + "#" + jersey;
	}
}

public class PlayerInfoMapV2{
      		//field
      		private HashMap<String, HockeyPlayer> playerMap; 

      		//constructor
      		public PlayerInfoMapV2(){
      			setPlayerMap();	
      		}
      		
      		//setter
      		public void setPlayerMap(){
      			//initialize HockeyPlayer objects
      			HockeyPlayer ovechkin = new HockeyPlayer("Ovechkin", "Forward, RW", 8);
      			HockeyPlayer backstrom = new HockeyPlayer("Backstrom", "Forward, C", 19);
      			HockeyPlayer holtby = new HockeyPlayer("Holtby", "Goalie", 70);
      			HockeyPlayer copley = new HockeyPlayer("Copley", "Goalie", 1);
      			HockeyPlayer kuznetsov = new HockeyPlayer("Kuznetsov", "Forward, C", 92);
      			HockeyPlayer orlov = new HockeyPlayer("Orlov", "Defense", 9);
      			HockeyPlayer carlson = new HockeyPlayer("Carlson", "Defense", 74);
      			HockeyPlayer vrana = new HockeyPlayer("Vrana", "Forward, LW", 13);
      			HockeyPlayer wilson = new HockeyPlayer("Wilson", "Forward, RW", 43);
      			HockeyPlayer oshie = new HockeyPlayer("Oshie", "Forward, RW", 77);
      			HockeyPlayer bowey = new HockeyPlayer("Bowey", "Defense", 22);
      			HockeyPlayer siegenthaler = new HockeyPlayer("Siegenthaler", "Defense", 34);
      			HockeyPlayer connolly = new HockeyPlayer("Connolly", "Forward, RW", 10);
      			HockeyPlayer orpik = new HockeyPlayer("Orpik", "Defense", 44);
      			HockeyPlayer boyd = new HockeyPlayer("Boyd", "Forward, C", 72);
      			HockeyPlayer kempny = new HockeyPlayer("Kempny", "Defense", 6);
      			HockeyPlayer dowd = new HockeyPlayer("Dowd", "Forward, C", 26);
      			HockeyPlayer burakovsky = new HockeyPlayer("Burakovsky", "Forward, LW", 65);
      			HockeyPlayer eller = new HockeyPlayer("Eller", "Forward, C", 20);
      			HockeyPlayer djoos = new HockeyPlayer("Djoos", "Defense", 29);
      			HockeyPlayer jaskin = new HockeyPlayer("Jaskin", "Forward, RW", 23);
      			HockeyPlayer smithPelly = new HockeyPlayer("Smith-Pelly", "Forward, RW",25);
      			HockeyPlayer stephenson = new HockeyPlayer("Stephenson", "Forward, C",18);
      			HockeyPlayer niskanen = new HockeyPlayer("Niskanen", "Defense", 2);
      			
      			//initialize hashmap: lastName is key, value is corresponding HockeyPlayer object (lastName, position, jersey)
      			playerMap = new HashMap<String, HockeyPlayer>();
			playerMap.put("Ovechkin", ovechkin);
			playerMap.put("Backstrom", backstrom);
			playerMap.put("Holtby", holtby);
			playerMap.put("Copley", copley);
			playerMap.put("Kuznetsov", kuznetsov);
			playerMap.put("Orlov", orlov);
			playerMap.put("Carlson", carlson);
			playerMap.put("Vrana", vrana);
			playerMap.put("Wilson", wilson);
			playerMap.put("Oshie", oshie);
			playerMap.put("Bowey", bowey);
			playerMap.put("Siegenthaler", siegenthaler);
			playerMap.put("Connolly", connolly);
			playerMap.put("Orpik", orpik);
			playerMap.put("Boyd", boyd);
			playerMap.put("Kempny", kempny);
			playerMap.put("Dowd", dowd);
			playerMap.put("Burakovsky", burakovsky);
			playerMap.put("Eller", eller);
			playerMap.put("Djoos", djoos);
			playerMap.put("Jaskin", jaskin);
			playerMap.put("Smith-Pelly", smithPelly);
			playerMap.put("Stephenson", stephenson);
			playerMap.put("Niskanen", niskanen);
      		}
      		
      		//getter
      		public HashMap getPlayerMap(){
      			return playerMap;	
      		}
      		
      		//main method
      		public static void main(String[] args) {
      			PlayerInfoMapV2 pim = new PlayerInfoMapV2();
			// Retrieving information from a HashMap
			Set avaKeys = pim.playerMap.keySet();
			Collection avaValues = pim.playerMap.values();
			Integer copleyNum = pim.playerMap.get("Copley").getJersey();
			String kempnyPosition = pim.playerMap.get("Kempny").getPosition();
			Integer connollyNum = pim.playerMap.get("Connolly").getJersey();
			Integer boydNum = pim.playerMap.get("Boyd").getJersey();
			String burakovskyPosition = pim.playerMap.get("Burakovsky").getPosition();
				
			// Output
			System.out.println("2018-2019 Regular Season Players and their last name / position / jersey numbers:\n " + pim.playerMap);
			System.out.println();
			System.out.println("2018-2019 Regular Season Players: \n" + avaKeys);
			System.out.println();
			System.out.println("2018 - 2019 Regular Season Last Names, Positions, and Jersey Numbers: " + avaValues);
			System.out.println();
			System.out.println("Pheonix Copley's jersey number is " + copleyNum + ".");
			System.out.println("Michal Kempny's position is " + kempnyPosition + ".");
			System.out.println("Brett Connolly's jersey number is " + connollyNum + ".");
			System.out.println("Travis Boyd's jersey number is " + boydNum + ".");
			System.out.println("Andre Burakovsky's position is " + burakovskyPosition + ".");
		}
}