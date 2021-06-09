package main;

public class Grader {
	
	public String findGrade(int percentage) {
		if(percentage >= 95) return "A";
		else if(percentage > 85 && percentage < 95) return "B";
		else if(percentage > 75 && percentage < 85) return "C";
		else return "Please improve your score";
	}

}
