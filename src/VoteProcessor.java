import java.util.ArrayList;

public class VoteProcessor  {

	
public String calculateElectionWinner(ArrayList<String> votes) {
	// TODO Auto-generated method stub
	int scoreF =0;
	int scoreE =0;
	//Level3CodingExam l = new Level3CodingExam();
	
	for(int i=0; i<votes.size();i++) {
		if(votes.get(i).equals("pope francis")){
			scoreF+=1;
			
		}
		else if(votes.get(i).equals("Pope Francis")) {
			scoreF+=1;
		}
		else if(votes.get(i).equals("Pope francis")) {
			scoreF+=1;
		}
		else if(votes.get(i).equals("pope Francis")) {
			scoreF+=1;
		}
		
		else {
			scoreE+=1;
		}
	
	}
	if(scoreF>scoreE) {
		return "pope francis";
	}
	else if(scoreF<scoreE) {
		return "Edwards";
	}
	else {
		
	
	return "TIE";
	}
	
	
}
}

