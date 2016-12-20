package schoolkata;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AverageOfResultsTest {
	private TotalMarks totalmarks;

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void should_calculate_average_of_3_results() throws Exception {
		int mark3 = 78;
		int mark2 = 100;
		int mark1 = 10;
		float expected = 62;
		totalmarks = new TotalMarks(mark1, mark2, mark3);
		assertEquals(expected, totalmarks.calculateAverageResult(), 2);
	}

	@Test
	public void should_say_pass_when_averagemarks_is_equalOrgreaterThan60() throws Exception {
		int mark3 = 78;
		int mark2 = 100;
		int mark1 = 10;
		totalmarks = new TotalMarks(mark1, mark2, mark3);
		HashMap<String, String> expectedmap=new HashMap<String, String>() ;
		expectedmap.put("student1", "pass");
		expectedmap.put("student2", "pass");

		PuttingTogether studentData = new PuttingTogether();
		studentData.setStudentResult("student1", totalmarks);
		
		totalmarks = new TotalMarks(65, 62, 70);
		studentData.setStudentResult("student2", totalmarks);
		
		HashMap<String, String>  map = studentData.getStudentResult();
		assertTrue(map.equals(expectedmap));
		
	}

}
