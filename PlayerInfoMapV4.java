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

class Skater extends HockeyPlayer{
	//field
	private int points;
	
	//constructor
	public Skater(HockeyPlayer hp, int points){
		super(hp.getLastName(), hp.getPosition(), hp.getJersey());
		this.points = points;
	}
	
	//setter
	public void setPoints(int points){
		this.points = points;	
	}
	
	//getter
	public int getPoints(){
		return points;	
	}	
	
	@Override
	public String toString(){
		return super.toString() + " | " + points + " points";
	}
}

class Goalie extends HockeyPlayer{
	//field
	private int wins;
	
	//constructor
	public Goalie(HockeyPlayer hp, int wins){
		super(hp.getLastName(), hp.getPosition(), hp.getJersey());
		this.wins = wins;
	}
	
	//setter
	public void setWins(int wins){
		this.wins = wins;	
	}
	
	//getter
	public int getWins(){
		return wins;
	}	
	
	@Override
	public String toString(){
		return super.toString() + " | " + wins + " wins";	
	}
}

class HPCompare implements Comparator<Object>{
	//field
	private int sortByThis;
	
	//constructor
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

public class PlayerInfoMapV4{
      		//fields
      		private HashMap<String, HockeyPlayer> playerMap2018; 
      		private HashMap<String, HockeyPlayer> playerMap2017;

      		//constructor
      		public PlayerInfoMapV4(){
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
      		
      		//setters
      		public void setPlayerMap2018(){
      			//initialize hashmap: lastName is key, value is corresponding HockeyPlayer object (lastName, position, jersey)
      			playerMap2018 = new HashMap<String, HockeyPlayer>();
			playerMap2018.put("Ovechkin", new Skater(ovechkin, 39));
			playerMap2018.put("Backstrom", new Skater(backstrom, 38));
			playerMap2018.put("Holtby", new Goalie(holtby, 12));
			playerMap2018.put("Copley", new Goalie(copley, 6));
			playerMap2018.put("Kuznetsov", new Skater(kuznetsov, 29));
			playerMap2018.put("Orlov", new Skater(orlov, 11));
			playerMap2018.put("Carlson", new Skater(carlson, 32));
			playerMap2018.put("Vrana", new Skater(vrana, 18));
			playerMap2018.put("Wilson", new Skater(wilson, 14));
			playerMap2018.put("Oshie", new Skater(oshie, 15));
			playerMap2018.put("Bowey", new Skater(bowey, 5));
			playerMap2018.put("Siegenthaler", new Skater(siegenthaler, 0));
			playerMap2018.put("Connolly", new Skater(connolly, 19));
			playerMap2018.put("Orpik", new Skater(orpik, 2));
			playerMap2018.put("Boyd", new Skater(boyd, 9));
			playerMap2018.put("Kempny", new Skater(kempny, 10));
			playerMap2018.put("Dowd", new Skater(dowd, 9));
			playerMap2018.put("Burakovsky", new Skater(burakovsky, 8));
			playerMap2018.put("Eller", new Skater(eller, 14));
			playerMap2018.put("Djoos", new Skater(djoos, 4));
			playerMap2018.put("Jaskin", new Skater(jaskin, 7));
			playerMap2018.put("Smith-Pelly", new Skater(smithPelly, 6));
			playerMap2018.put("Stephenson", new Skater(stephenson, 6));
			playerMap2018.put("Niskanen", new Skater(niskanen, 14));
      		}
      		
      		public void setPlayerMap2017(){
      			//initialize hashmap: lastName is key, value is corresponding HockeyPlayer object (lastName, position, jersey)
      			playerMap2017 = new HashMap<String, HockeyPlayer>();
			playerMap2017.put("Ovechkin", new Skater(ovechkin, 87));
			playerMap2017.put("Backstrom", new Skater(backstrom, 71));
			playerMap2017.put("Beagle", new Skater(beagle, 22));
			playerMap2017.put("Holtby", new Goalie(holtby, 34));
			playerMap2017.put("Kuznetsov", new Skater(kuznetsov, 83));
			playerMap2017.put("Orlov", new Skater(orlov, 31));
			playerMap2017.put("Carlson", new Skater(carlson, 68));
			playerMap2017.put("Vrana", new Skater(vrana, 27));
			playerMap2017.put("Wilson", new Skater(wilson, 35));
			playerMap2017.put("Oshie", new Skater(oshie, 47));
			playerMap2017.put("Bowey", new Skater(bowey, 12));
			playerMap2017.put("Connolly", new Skater(connolly, 27));
			playerMap2017.put("Orpik", new Skater(orpik, 10));
			playerMap2017.put("Boyd", new Skater(boyd, 1));
			playerMap2017.put("Kempny", new Skater(kempny, 3));
			playerMap2017.put("Burakovsky", new Skater(burakovsky, 25));
			playerMap2017.put("Eller", new Skater(eller, 38));
			playerMap2017.put("Djoos", new Skater(djoos, 14));
			playerMap2017.put("Smith-Pelly", new Skater(smithPelly, 16));
			playerMap2017.put("Stephenson", new Skater(stephenson, 18));
			playerMap2017.put("Niskanen", new Skater(niskanen, 29));
			playerMap2017.put("Chiasson", new Skater(chiasson, 18));
			playerMap2017.put("Gersich", new Skater(gersich, 1));
			playerMap2017.put("Graovac", new Skater(graovac, 0));
			playerMap2017.put("O'Brien", new Skater(obrien, 0));
			playerMap2017.put("Peluso", new Skater(peluso, 0));
			playerMap2017.put("Walker", new Skater(walker, 1));
			playerMap2017.put("Chorney", new Skater(chorney, 4));
			playerMap2017.put("Jerabek", new Skater(jerabek, 4));
			playerMap2017.put("Ness", new Skater(ness, 1));
			playerMap2017.put("Grubauer", new Goalie(grubauer, 15));	
      		}
      		
      		//getters
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
      			PlayerInfoMapV4 pim = new PlayerInfoMapV4();
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
			System.out.println("***** 2018 - 2019 Regular Season Roster + Stats *****");
			List sortedRoster = pim.sortRoster(avaValues2018, 1);
			pim.printRoster(sortedRoster);
			
			System.out.println();
			
			//2017 - 2018 roster formatted output
			System.out.println("***** 2017 - 2018 Regular Season Roster + Stats *****");
			sortedRoster = pim.sortRoster(avaValues2017, 1);
			pim.printRoster(sortedRoster);
			
		}
}