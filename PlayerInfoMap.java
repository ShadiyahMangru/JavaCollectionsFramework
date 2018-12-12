import java.util.*;

class PlayerInfoMap{
      		//field
      		private HashMap<String, Integer> numberMap = new HashMap<String, Integer>();

      		//constructor
      		public PlayerInfoMap(){
      			setNumberMap();	
      		}
      		
      		//setter
      		public void setNumberMap(){
			numberMap.put("Ovechkin", 8);
			numberMap.put("Backstrom", 19);
			numberMap.put("Holtby", 70);
			numberMap.put("Copley", 1);
			numberMap.put("Kuznetsov", 92);
			numberMap.put("Orlov", 9);
			numberMap.put("Carlson", 74);
			numberMap.put("Vrana", 13);
			numberMap.put("Wilson", 43);
			numberMap.put("Oshie", 77);
			numberMap.put("Bowey", 22);
			numberMap.put("Siegenthaler", 34);
			numberMap.put("Connolly", 10);
			numberMap.put("Orpik", 44);
			numberMap.put("Boyd", 72);
			numberMap.put("Kempny", 6);
			numberMap.put("Dowd", 26);
			numberMap.put("Burakovsky", 65);
			numberMap.put("Eller", 20);
			numberMap.put("Djoos", 29);
			numberMap.put("Jaskin", 23);
			numberMap.put("Smith-Pelly", 25);
			numberMap.put("Stephenson", 18);
			numberMap.put("Niskanen", 2);
      		}
      		
      		//getter
      		public HashMap getNumberMap(){
      			return numberMap;	
      		}
      		
      		//main method
      		public static void main(String[] args) {
      			PlayerInfoMap pim = new PlayerInfoMap();
			// Retrieving information from a HashMap
			Set avaKeys = pim.numberMap.keySet();
			Collection avaValues = pim.numberMap.values();
			Integer CopleyNum = pim.numberMap.get("Copley");
			Integer KempnyNum = pim.numberMap.get("Kempny");
			Integer ConnollyNum = pim.numberMap.get("Connolly");
			Integer BoydNum = pim.numberMap.get("Boyd");
			Integer BurakovskyNum = pim.numberMap.get("Burakovsky");
				
			// Output
			System.out.println("2018-2019 Regular Season Players and their jersey numbers:\n " + pim.numberMap);
			System.out.println();
			System.out.println("2018-2019 Regular Season Players: \n" + avaKeys);
			System.out.println();
			System.out.println("2018 - 2019 Regular Season Jersey Numbers: " + avaValues);
			System.out.println();
			System.out.println("Pheonix Copley's jersey number is " + CopleyNum + ".");
			System.out.println("Michal Kempny's jersey number is " + KempnyNum + ".");
			System.out.println("Brett Connolly's jersey number is " + ConnollyNum + ".");
			System.out.println("Travis Boyd's jersey number is " + BoydNum + ".");
			System.out.println("Andre Burakovsky's jersey number is " + BurakovskyNum + ".");
		}
}