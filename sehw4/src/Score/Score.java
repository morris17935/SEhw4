package Score;

import java.util.Scanner;

public class Score {
	
	public static void main(String[] args){
		 java.io.BufferedReader buf = new java.io.BufferedReader(   
	                new java.io.InputStreamReader(System.in));  
        String temp;
        try {
            System.out.print("請輸入成績：");
            temp = buf.readLine();
            while ( temp != null) {
                System.out.println(ConvertScoreToLetter(Double.parseDouble(temp)));
                System.out.print("請輸入成績：");
                temp = buf.readLine();
            }
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
        }
	}
	
	
	public static char ConvertScoreToLetter(double score){
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
