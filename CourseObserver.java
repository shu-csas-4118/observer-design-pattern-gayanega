import java.util.ArrayList;

public class CourseObserver implements IObserver {

	public CourseObserver() {
		
	}
	


	public void printcourseInfo(Course course) {
		System.out.println("Student's course is " + course.getcourseName());
		System.out.println("Student's course number is " + course.getcourseNumber());
		System.out.println("Course credit(s): " + course.getcourseCredits());
		System.out.println("Student's professor is:  " + course.getProfessor());
	}

	public void printCourses(ArrayList<Course> courses) {
		for(int i = 0; i < courses.size(); i++) {
			printcourseInfo(courses.get(i));
		}
	}
	
	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		printCourses(student.getCourses());
	}
	
}