package schoolkata;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ResultTest {

	private Result result;
	private int marks;

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void should_determine_the_result_if_marks_is_less_then_sixty()
			throws Exception {
		
		result = new Result(50);
		assertEquals("fail", result.calculateFinalResult());
	}

	@Test
	public void should_say_pass_if_marks_is_equal_to_60() throws Exception {
		result = new Result(60);
		assertEquals("pass", result.calculateFinalResult());

	}
	@Test
	public void should_say_pass_if_marks_is_greater_than_60() throws Exception {
		result = new Result(70);
		assertEquals("pass", result.calculateFinalResult());
	}
	
	@Test
	public void should_say_invalid_marks_if_more_than_100() throws Exception {
		result = new Result(110);
		assertEquals("not valid", result.calculateFinalResult());
	}
	


}
