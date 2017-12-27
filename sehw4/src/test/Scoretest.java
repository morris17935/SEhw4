package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Score.Score;

public class Scoretest {
	Score score = new Score();
	@Test
	public void testCharX(){
		assertEquals('X',score.ConvertScoreToLetter(-1));
		assertEquals('X',score.ConvertScoreToLetter(101));
	}
	@Test
	public void testCharF(){
		assertEquals('F',score.ConvertScoreToLetter(0));
		assertEquals('F',score.ConvertScoreToLetter(59));
	}
	@Test
	public void testCharD(){
		assertEquals('D',score.ConvertScoreToLetter(60));
		assertEquals('D',score.ConvertScoreToLetter(69));
	}
	@Test
	public void testCharC(){
		assertEquals('C',score.ConvertScoreToLetter(70));
		assertEquals('C',score.ConvertScoreToLetter(79));
	}
	@Test
	public void testCharB(){
		assertEquals('B',score.ConvertScoreToLetter(80));
		assertEquals('B',score.ConvertScoreToLetter(89));
	}
	@Test
	public void testCharA(){
		assertEquals('A',score.ConvertScoreToLetter(90));
		assertEquals('A',score.ConvertScoreToLetter(99));
	}

}
