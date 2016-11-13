
public class voter {
//	voter ID contains the ID of a voter as an int.
	private int voter_ID;
//	vovterName contains the full name of the voter
	public String voterName;
//	voter info contains other information of the voter which could include registration status.
	public String voterInfo;
	
//	Purpose: get the voter ID 
//	Preconditions: none
//	Postconditions: return voter ID
	public int getVoter_ID() {
		return voter_ID;
	}

//	Purpose: set the voter ID
//	Preconditions: none
//	Postconditions: updates the voter ID
	public void setVoter_ID(int voter_ID) {
		this.voter_ID = voter_ID;
	}
	
//	Purpose:logs the user in uses approve login
//	Preconditions: use login information for the voter
//	Postconditions: use is logged in
	public void login(){
		
	}
//	Purpose:select a candidate 
//	Preconditions: none
//	Postconditions: marks candidate as selected and saved for review later
	public void selectCandidate(){
		
	}
	
//	Purpose: confirm selected candidates 
//	Preconditions: none
//	Postconditions: votes are sent to the voter handler once confirmed
	public void castVote(){
		
	}
	
}
