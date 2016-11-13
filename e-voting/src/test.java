
public class test {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 candidate can = new candidate(234390432,"john", "g", 45);
		 
		System.out.println("can " +  can.candidateName + "\n" + can.getCandidate_ID() );
		
		can.setCandidate_ID(304975444);
		System.out.println("can " +  can.candidateName + "\n" + can.getCandidate_ID() );

	}

}
