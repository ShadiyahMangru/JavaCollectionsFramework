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

class HPCompare implements Comparator<Object>{
	
	private int sortByThis;
	
	public HPCompare(int sortByThis){
		this.sortByThis = sortByThis;	
	}
	
	@Override
	public int compare(Object o1, Object o2) { 
		if(sortByThis == 1){	
			HockeyPlayer h1 = (HockeyPlayer)o1;
			HockeyPlayer h2 = (HockeyPlayer)o2;
			if (h1.getLastName().compareTo(h2.getLastName()) > 0) 
				return 1; 
			if (h1.getLastName().compareTo(h2.getLastName()) == 0) 
				return 0; 
		}
		else if(sortByThis == 2){	
			HockeyPlayer h1 = (HockeyPlayer)o1;
			HockeyPlayer h2 = (HockeyPlayer)o2;
			if (h1.getPosition().compareTo(h2.getPosition()) > 0) 
				return 1; 
			if (h1.getPosition().compareTo(h2.getPosition()) == 0) 
				return 0; 
		}
		return -1;	
	} 
	
}

public class PlayerInfoMapV3{
      		//field
      		private HashMap<String, HockeyPlayer> playerMap2018; 
      		private HashMap<String, HockeyPlayer> playerMap2017;

      		//constructor
      		public PlayerInfoMapV3(){
      			setPlayerMap2018();	
      			setPlayerMap2017();
      		}
      		
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
      		HockeyPlayer beagle = new HockeyPlayer("Beagle", "Forward, C", 83);
      		HockeyPlayer chiasson = new HockeyPlayer("Chiasson", "Forward, RW", 39);
      		HockeyPlayer gersich = new HockeyPlayer("Gersich", "Forward, LW", 63);
      		HockeyPlayer graovac = new HockeyPlayer("Graovac", "Forward, C", 44);
      		HockeyPlayer obrien = new HockeyPlayer("O'Brien", "Forward, C", 87);
      		HockeyPlayer peluso = new HockeyPlayer("Peluso", "Forward, RW", 16);
      		HockeyPlayer walker = new HockeyPlayer("Walker", "Forward, LW", 79);
      		HockeyPlayer chorney = new HockeyPlayer("Chorney", "Defense", 44);
      		HockeyPlayer jerabek = new HockeyPlayer("Jerabek", "Defense", 28);
      		HockeyPlayer ness = new HockeyPlayer("Ness", "Defense", 55);
      		HockeyPlayer grubauer = new HockeyPlayer("Grubauer", "Goalie", 31);
      		
      		//setter
      		public void setPlayerMap2018(){
      			//initialize hashmap: lastName is key, value is corresponding HockeyPlayer object (lastName, position, jersey)
      			playerMap2018 = new HashMap<String, HockeyPlayer>();
			playerMap2018.put("Ovechkin", ovechkin);
			playerMap2018.put("Backstrom", backstrom);
			playerMap2018.put("Holtby", holtby);
			playerMap2018.put("Copley", copley);
			playerMap2018.put("Kuznetsov", kuznetsov);
			playerMap2018.put("Orlov", orlov);
			playerMap2018.put("Carlson", carlson);
			playerMap2018.put("Vrana", vrana);
			playerMap2018.put("Wilson", wilson);
			playerMap2018.put("Oshie", oshie);
			playerMap2018.put("Bowey", bowey);
			playerMap2018.put("Siegenthaler", siegenthaler);
			playerMap2018.put("Connolly", connolly);
			playerMap2018.put("Orpik", orpik);
			playerMap2018.put("Boyd", boyd);
			playerMap2018.put("Kempny", kempny);
			playerMap2018.put("Dowd", dowd);
			playerMap2018.put("Burakovsky", burakovsky);
			playerMap2018.put("Eller", eller);
			playerMap2018.put("Djoos", djoos);
			playerMap2018.put("Jaskin", jaskin);
			playerMap2018.put("Smith-Pelly", smithPelly);
			playerMap2018.put("Stephenson", stephenson);
			playerMap2018.put("Niskanen", niskanen);
      		}
      		
      		public void setPlayerMap2017(){
      			//initialize hashmap: lastName is key, value is corresponding HockeyPlayer object (lastName, position, jersey)
      			playerMap2017 = new HashMap<String, HockeyPlayer>();
			playerMap2017.put("Ovechkin", ovechkin);
			playerMap2017.put("Backstrom", backstrom);
			playerMap2017.put("Beagle", beagle);
			playerMap2017.put("Holtby", holtby);
			playerMap2017.put("Kuznetsov", kuznetsov);
			playerMap2017.put("Orlov", orlov);
			playerMap2017.put("Carlson", carlson);
			playerMap2017.put("Vrana", vrana);
			playerMap2017.put("Wilson", wilson);
			playerMap2017.put("Oshie", oshie);
			playerMap2017.put("Bowey", bowey);
			playerMap2017.put("Connolly", connolly);
			playerMap2017.put("Orpik", orpik);
			playerMap2017.put("Boyd", boyd);
			playerMap2017.put("Kempny", kempny);
			playerMap2017.put("Burakovsky", burakovsky);
			playerMap2017.put("Eller", eller);
			playerMap2017.put("Djoos", djoos);
			playerMap2017.put("Smith-Pelly", smithPelly);
			playerMap2017.put("Stephenson", stephenson);
			playerMap2017.put("Niskanen", niskanen);
			playerMap2017.put("Chiasson", chiasson);
			playerMap2017.put("Gersich", gersich);
			playerMap2017.put("Graovac", graovac);
			playerMap2017.put("O'Brien", obrien);
			playerMap2017.put("Peluso", peluso);
			playerMap2017.put("Walker", walker);
			playerMap2017.put("Chorney", chorney);
			playerMap2017.put("Jerabek", jerabek);
			playerMap2017.put("Ness", ness);
			playerMap2017.put("Grubauer", grubauer);	
      		}
      		
      		//getter
      		public HashMap getPlayerMap2018(){
      			return playerMap2018;	
      		}
      		
      		public HashMap getPlayerMap2017(){
      			return playerMap2017;
      		}	
      		
      		//print last name / position / jersey number of a roster
		public void printRoster(List roster){	
			Iterator<HockeyPlayer> iterator = roster.iterator();
			while(iterator.hasNext()) {
			HockeyPlayer setElement = iterator.next();
			System.out.println(setElement);
			}
		}
      		
		//sort roster by last name or position
		public List sortRoster(Collection roster, int sortBy){ 
			List avaVal = new ArrayList(roster);
			HPCompare hpc = new HPCompare(sortBy);
			Collections.sort(avaVal, hpc);
			return avaVal;
		}
		
      		//main method
      		public static void main(String[] args) {
      			PlayerInfoMapV3 pim = new PlayerInfoMapV3();
			// Retrieving information from a HashMap
			Set avaKeys2018 = pim.playerMap2018.keySet();
			Set avaKeys2017 = pim.playerMap2017.keySet();
			Collection avaValues2018 = pim.playerMap2018.values();
			Collection avaValues2017 = pim.playerMap2017.values();
			
			Integer copleyNum = pim.playerMap2018.get("Copley").getJersey();
			String kempnyPosition = pim.playerMap2018.get("Kempny").getPosition();
			Integer connollyNum = pim.playerMap2018.get("Connolly").getJersey();
			Integer boydNum = pim.playerMap2018.get("Boyd").getJersey();
			String burakovskyPosition = pim.playerMap2018.get("Burakovsky").getPosition();
			
			Integer beagleNum = pim.playerMap2017.get("Beagle").getJersey();
			String grubauerPosition = pim.playerMap2017.get("Grubauer").getPosition();
			
			// Output
			//use of map keys to easily access player info
			System.out.println("***** 2018 - 2019 Player Info *****");
			System.out.println("Pheonix Copley's jersey number is " + copleyNum + ".");
			System.out.println("Michal Kempny's position is " + kempnyPosition + ".");
			System.out.println("Brett Connolly's jersey number is " + connollyNum + ".");
			System.out.println("Travis Boyd's jersey number is " + boydNum + ".");
			System.out.println("Andre Burakovsky's position is " + burakovskyPosition + ".");
			System.out.println();
			
			System.out.println("***** 2017 - 2018 Player Info *****");
			System.out.println("Jay Beagle's jersey number is " + beagleNum + ".");
			System.out.println("Philipp Grubauer's position is " + grubauerPosition + ".");
			System.out.println();
			
			//check to see if a player is in a given year's roster ('check set membership')
			System.out.println("***** Roster Membership? *****");
			System.out.println("Copley is a part of the 2018 - 2019 Regular Season Roster: " + avaKeys2018.contains("Copley"));
			System.out.println("Grubauer is a part of the 2018 - 2019 Regular Season Roster: " + avaKeys2018.contains("Grubauer"));
			System.out.println("Grubauer is a part of the 2017 - 2018 Regular Season Roster: " + avaKeys2017.contains("Grubauer"));
			System.out.println();	
			
			//2018 - 2019 roster formatted output
			System.out.println("***** 2018 - 2019 Regular Season Roster *****");
			List sortedRoster = pim.sortRoster(avaValues2018, 1);
			pim.printRoster(sortedRoster);
			
			System.out.println();
			
			//2017 - 2018 roster formatted output
			System.out.println("***** 2017 - 2018 Regular Season Roster *****");
			sortedRoster = pim.sortRoster(avaValues2017, 1);
			pim.printRoster(sortedRoster);
			
			}
}