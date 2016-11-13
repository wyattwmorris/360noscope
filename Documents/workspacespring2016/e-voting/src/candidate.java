
public class candidate {
//	contains the ID of the candidate as an int
	private int candidate_ID;
//	contains the candidates full name as a string 
	public String candidateName;
//	contains the candidates party as a string 
	public String canddiateParty;
//	contains the amount of current votes the candidate has 
	private int votes;
//	gets the candidates ID
	public int getCandidate_ID() {
		return candidate_ID;
	}
//	sets the candidates ID
	public void setCandidate_ID(int candidate_ID) {
		this.candidate_ID = candidate_ID;
	}
//gets the votes of the candidate
	public int getVotes() {
		return votes;
	}
//	sets the amount of votes the candidate has

	public void setVotes(int votes) {
		this.votes = votes;
	}

}
