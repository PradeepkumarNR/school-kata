package schoolkata;

public class TotalMarks {
	int mark1;
	int mark2;
	int mark3;

	public TotalMarks(int mark1, int mark2, int mark3) {
		super();
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	public float calculateAverageResult() {
		float average = (mark1 + mark2 + mark3) / 3;
		return average;
	}

}
