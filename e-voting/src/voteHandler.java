//Task: handles interaction between the voter and the voterUI (display)
//Input: Several inputs to handle interaction
//Output: actions
public class voteHandler<String> {
	
//	Purpose: returns true if login is valid
//	Preconditions: takes in login information to verify
//	Postconditions: returns true or false
	public boolean approveLogin(String dbLogin, String dbPassword){
		if( voter.login().equals(dbLogin) && voter.password().equals(dbPassword )){
			return true;
		}
		else{
		return false;
		}
	}
	
	
//	Purpose:not needed approveLogin will handle this
//	Preconditions: none
//	Postconditions:  
//	danyVote()
	

	
//	Purpose: print out ticket
//	Preconditions: takes voter information and review for printing purposes 
//	Postconditions: collective information will be printed on a ticket 
	public void printTicket(String voterInfo, String review){
		if(voter.isDoneVoting() == true){
			
		}
	}
//	Purpose: transfer data safely to data base
//	Preconditions: 
//	Postconditions: data is transfered to database. 
	public void saveToDatabase(){
		
	}
	

}
