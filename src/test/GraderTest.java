package test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import main.Grader;

public class GraderTest {

	@Ignore()
	@Test
	public void test() {
		Grader grader = new Grader();
		String grade = grader.findGrade(95);
		assertEquals("The grade doesn't match","A",grade);
		
	}

}
