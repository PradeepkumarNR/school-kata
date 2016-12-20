package schoolkata;

import java.util.HashMap;

public class PuttingTogether {

	HashMap<String, String>  map = new HashMap<String, String>();
	
	public void setStudentResult(String studentName, TotalMarks totalmarks){
		Result result = new Result(totalmarks);
		map.put(studentName, result.calculateFinalResult());
		
	}
	
	public HashMap<String, String> getStudentResult(){
		return map;
	}
	


	


}
