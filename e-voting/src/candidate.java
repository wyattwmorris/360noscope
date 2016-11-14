
public class candidate {
//	contains the ID of the candidate as an int
	private int candidateID = 00000000 ;
//	contains the candidates full name as a string 
	public static String candidateName = "";
//	contains the candidates party as a string 
	public static String candidateParty = "";
//	contains the amount of current votes the candidate has 
	private static int votes = 0 ;
	public candidate(){
		
	}
	public candidate( int candID, String canName,String canParty,int  v){
		candidateID = candID;
		candidateName = canName;
		candidateParty = canParty;
		votes = v;
		
		
	}

//	gets candidates names
	public static String getCandName(){
		return candidateName;
	}
//	gets the candidates ID
	public int getCandidate_ID() {
		return candidateID;
	}
//	sets the candidates ID
	public void setCandidate_ID(int candidate_ID) {
		this.candidateID = candidate_ID;
	}
	
	public void setParty(String candParty){
		this.candidateParty = candParty;
	}
//gets the votes of the candidate
	public static int getVotes() {
		return votes;
	}
//	sets the amount of votes the candidate has

	public void setVotes(int votes) {
		this.votes = votes;
	}
	
	public void addVote(){
		votes = votes + 1;
		
	}
	public static String getCandParty() {
		return candidateParty;
	}
	
	public void printCand(){
		System.out.println("Candidate: " + this.getCandName());
		System.out.println("Candidate Party: " + this.getCandParty());
		System.out.println("Votes: " + this.getVotes());
	}

	
	

}
