import java.util.ArrayList;


public class database {
	private static ArrayList <candidate>canList = new ArrayList<candidate>();
	private int numVoters;
	static int totalVotes =0;
	
	public database(){
		
	}
	
	
	
	public static void addCand(candidate can){
		canList.add(can);
	}
	
	public void removeCand(candidate can){
		canList.remove(can);
		
	}
	
	public static candidate getCand(int index){
		return canList.get(index);
	}
	

	public static int getTotalVotes(){
		
		for(int i = 0; i< canList.size(); i++){
		totalVotes = totalVotes + canList.get(i).getVotes(); 
		}
		return totalVotes;
	}
	
	public static void printResults(){
		for(int i = 0; i< canList.size(); i++){
			System.out.println("size " + canList.size());
			canList.get(i).printCand();
		}
		System.out.println("Total Votes: "+ database.getTotalVotes());
	}

	

}
