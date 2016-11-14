
public class test {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 candidate can = new candidate(234390432,"john", "g", 45);
		 
//		System.out.println("can " +  can.candidateName + "\n" + can.getCandidate_ID() );
//		
//		can.setCandidate_ID(304975444);
//		System.out.println("can " +  can.getCandName() + "\n" + can.getCandidate_ID() );
//		
//		can.printCand();
		
		candidate can2 = new candidate(00000000,"guyman", "L", 56);
		
//		database.addCand(can);
//		database.addCand(can);
		database.addCand(can2);
//		System.out.println(database.getCand(0));
		database.printResults();
		

	}

}
