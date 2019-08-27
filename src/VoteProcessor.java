import java.util.ArrayList;

public class VoteProcessor  {

	


private static final String voters = null;

public String calculateElectionWinner(ArrayList<String> votes) {
	// TODO Auto-generated method stub
	int scoreF =0;
	int scoreE =0;
	Level3CodingExam l = new Level3CodingExam();
	
	for(int i=0; i<votes.size();i++) {
		if(voters.equals("pope francis")){
			scoreF+=1;
			l.testWinner();
		}
//		else if(votes.equals("Pope Francis")) {
//			scoreF+=1;
//		}
//		else if(votes.equals("Pope francis")) {
//			scoreF+=1;
//		}
//		else if(votes.equals("pope Francis")) {
//			scoreF+=1;
//		}
//		
//		else {
//			scoreE+=1;
//		}
//	
//	if(scoreF>scoreE) {
//		System.out.println("Francis won");
//	}
//	else if(scoreF==scoreE) {
//		testATie();
//	}
//	else {
//		System.out.println("Other Guy won");
//	}
	
	
	
	return null;
}
}