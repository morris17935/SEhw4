package Score;

public class Score {
	
	public char ConvertScoreToLetter(double score){
		if(score>100||score<0)
			return 'X';
		else if(score >= 0&&score<60)
			return 'F';
		else if(score >= 60&&score<70)
			return 'D';
		else if(score >= 70&&score<80)
			return 'C';
		else if(score >= 80&&score<90)
			return 'B';
		else 
			return 'A';
	}
}
