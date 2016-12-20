package schoolkata;

public class Result {
	float finalresult;

	public Result(TotalMarks totalmarks) {
		this.finalresult = totalmarks.calculateAverageResult();
	}

	public Result(int marks) {
		this.finalresult = marks;
	}

	public Result() {
		// TODO Auto-generated constructor stub
	}

	public String calculateFinalResult() {

		if (isMarksInTheRange(finalresult)) {
			return "pass";
		} else if (isMarksValid(finalresult)) {
			return "not valid";
		}
		return "fail";

	}

	private boolean isMarksValid(float marks) {
		return marks > 100;
	}

	private boolean isMarksInTheRange(float marks) {
		return marks >= 60 && marks < 100;
	}

}
