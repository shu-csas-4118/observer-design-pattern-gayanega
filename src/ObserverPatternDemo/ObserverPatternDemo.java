import java.util.ArrayList;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Garett", "Chang", 123456, "changgar@shu.edu");
		
		ArrayList<Course> courses1 = new ArrayList<Course>();
		Course course = new Course("Software Engineering", 1, 3, "Garrett Chang");
		Course course2 = new Course("Computer Security", 2, 4, "Thomas Marlowe");
		
		IdNumberObserver idObserver =  new IdNumberObserver();
		FirstNameObserver firstNameObserver = new FirstNameObserver();
		LastNameObserver lastNameObserver = new LastNameObserver();
		EmailObserver emailObserver = new EmailObserver();
		CourseObserver courseObserver = new CourseObserver();
		
		
		student.attachObserver(idObserver);
		student.attachObserver(firstNameObserver);
		student.attachObserver(lastNameObserver);
		student.attachObserver(emailObserver);
		student.attachObserver(courseObserver);
		
		
		student.setFirstName("AnotherFirstName");
		System.out.println("\n");
		
		student.setLastName("AnotherName");
		System.out.println("\n");
		
		student.setIdNumber(54321);
		System.out.println("\n");
		
		student.setEmail("garrett.chang@shu.edu");
		System.out.println("\n");
		
		student.setCourses(courses1);
		courses1.add(course);
		courses1.add(course2);
		
		System.out.println("\n");
		student.setCourses(courses1);
		
		System.out.println("\n");
		courses1.remove(course2);
		student.setCourses(courses1);
	}

}
