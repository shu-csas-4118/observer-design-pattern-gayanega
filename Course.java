public class Course {
	private String courseName;
	private int courseNumber;
	private int courseCredits;
	private String professor;
	
	public Course(String courseName, int courseNumber, int courseCredits, String professor) {
		this.courseName = courseName;
		this.courseNumber = courseNumber;
		this.courseCredits = courseCredits;
		this.professor = professor;
	}
	
	//Name
	public String getcourseName() {
		return courseName;
	}
	
	public void setcourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	//Number
	public int getcourseNumber() {
		return courseNumber;
	}
	
	public void setcourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	
	
	//Credits
	public int getcourseCredits() {
		return courseCredits;
	}
	
	public void setcourseCredits(int courseCredits) {
		this.courseCredits = courseCredits;
	}
	
	
	//Professor
	public String getProfessor() {
		return professor;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}
}
