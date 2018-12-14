import java.util.*;

class HockeyPlayer implements Comparable<HockeyPlayer>{
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
	
	@Override
    	public int compareTo(HockeyPlayer other) {
    		if (this.getLastName().compareTo(other.getLastName()) > 0) 
				return 1; 
		if (this.getLastName().compareTo(other.getLastName()) == 0) 
				return 0; 
    		return -1;
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

public class RosterTreeSet{
      		//fields
      		private TreeSet playerTreeSet2018; 
      		private TreeSet playerTreeSet2017;

      		//constructor
      		public RosterTreeSet(){
      			setPlayerTreeSet2018();	
      			setPlayerTreeSet2017();
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
      		public void setPlayerTreeSet2018(){
      			//initialize treeset with each HockeyPlayer object (lastName, position, jersey) for 2018
      			playerTreeSet2018 = new TreeSet();
			playerTreeSet2018.add(new Skater(ovechkin, 39));
			playerTreeSet2018.add(new Skater(backstrom, 38));
			playerTreeSet2018.add(new Goalie(holtby, 12));
			playerTreeSet2018.add(new Goalie(copley, 6));
			playerTreeSet2018.add(new Skater(kuznetsov, 29));
			playerTreeSet2018.add(new Skater(orlov, 11));
			playerTreeSet2018.add(new Skater(carlson, 32));
			playerTreeSet2018.add(new Skater(vrana, 18));
			playerTreeSet2018.add(new Skater(wilson, 14));
			playerTreeSet2018.add(new Skater(oshie, 15));
			playerTreeSet2018.add(new Skater(bowey, 5));
			playerTreeSet2018.add(new Skater(siegenthaler, 0));
			playerTreeSet2018.add(new Skater(connolly, 19));
			playerTreeSet2018.add(new Skater(orpik, 2));
			playerTreeSet2018.add(new Skater(boyd, 9));
			playerTreeSet2018.add(new Skater(kempny, 10));
			playerTreeSet2018.add(new Skater(dowd, 9));
			playerTreeSet2018.add(new Skater(burakovsky, 8));
			playerTreeSet2018.add(new Skater(eller, 14));
			playerTreeSet2018.add(new Skater(djoos, 4));
			playerTreeSet2018.add(new Skater(jaskin, 7));
			playerTreeSet2018.add(new Skater(smithPelly, 6));
			playerTreeSet2018.add(new Skater(stephenson, 6));
			playerTreeSet2018.add(new Skater(niskanen, 14));
      		}
      		
      		public void setPlayerTreeSet2017(){
      			//initialize treeset with each HockeyPlayer object (lastName, position, jersey) for 2017
      			playerTreeSet2017 = new TreeSet();
			playerTreeSet2017.add(ovechkin);
			playerTreeSet2017.add(new Skater(backstrom, 71));
			playerTreeSet2017.add(new Skater(beagle, 22));
			playerTreeSet2017.add(new Goalie(holtby, 34));
			playerTreeSet2017.add(new Skater(kuznetsov, 83));
			playerTreeSet2017.add(new Skater(orlov, 31));
			playerTreeSet2017.add(new Skater(carlson, 68));
			playerTreeSet2017.add(new Skater(vrana, 27));
			playerTreeSet2017.add(new Skater(wilson, 35));
			playerTreeSet2017.add(new Skater(oshie, 47));
			playerTreeSet2017.add(new Skater(bowey, 12));
			playerTreeSet2017.add(new Skater(connolly, 27));
			playerTreeSet2017.add(new Skater(orpik, 10));
			playerTreeSet2017.add(new Skater(boyd, 1));
			playerTreeSet2017.add(new Skater(kempny, 3));
			playerTreeSet2017.add(new Skater(burakovsky, 25));
			playerTreeSet2017.add(new Skater(eller, 38));
			playerTreeSet2017.add(new Skater(djoos, 14));
			playerTreeSet2017.add(new Skater(smithPelly, 16));
			playerTreeSet2017.add(new Skater(stephenson, 18));
			playerTreeSet2017.add(new Skater(niskanen, 29));
			playerTreeSet2017.add(new Skater(chiasson, 18));
			playerTreeSet2017.add(new Skater(gersich, 1));
			playerTreeSet2017.add(new Skater(graovac, 0));
			playerTreeSet2017.add(new Skater(obrien, 0));
			playerTreeSet2017.add(new Skater(peluso, 0));
			playerTreeSet2017.add(new Skater(walker, 1));
			playerTreeSet2017.add(new Skater(chorney, 4));
			playerTreeSet2017.add(new Skater(jerabek, 4));
			playerTreeSet2017.add(new Skater(ness, 1));
			playerTreeSet2017.add(new Goalie(grubauer, 15));	
      		}
      		
      		//getters
      		public TreeSet getPlayerTreeSet2018(){
      			return playerTreeSet2018;	
      		}
      		
      		public TreeSet getPlayerTreeSet2017(){
      			return playerTreeSet2017;
      		}	
		
      		//print roster
      		public void printRoster(TreeSet roster){
      			Iterator iterator;
			iterator = roster.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next() + " ");
			}	
      		}
      		
      		//main method
      		public static void main(String[] args) {
      			RosterTreeSet rts = new RosterTreeSet();
			
			//2018 - 2019 roster formatted output
			System.out.println("***** 2018 - 2019 Regular Season Roster + Stats *****");
			rts.printRoster(rts.getPlayerTreeSet2018());
			
			System.out.println();
			
			//2017 - 2018 roster formatted output
			System.out.println("***** 2017 - 2018 Regular Season Roster + Stats *****");
			rts.printRoster(rts.getPlayerTreeSet2017());	
		}
}