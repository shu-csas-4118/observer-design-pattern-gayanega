import java.util.ArrayList;

public class Student {
	private String firstName;
	private String lastName;
	private String email;
	private int idNumber;
	private ArrayList<IObserver> observers;
	private ArrayList<Course> courses;
	
	public Student(String firstName, String lastName, int idNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.email = email;
		this.observers = new ArrayList<IObserver>();
		this.courses = new ArrayList<Course>();
	}
	
	
	//first name
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		notifyAllObservers();
	}
	
	
	//last name
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	//id number
	public int getIdNumber() {
		return this.idNumber;
	}
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
		notifyAllObservers();
	}	
	
	
	//setEmail
	public void setEmail(String email) {
		this.email = email;
		notifyAllObservers();
	}
	
	public String getEmail() {
		return this.email;
	}
	
	
	//courses
	public ArrayList<Course> getCourses() {
		return courses;
	}
	
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
		notifyAllObservers();
	}
	
	public void addCourse(Course course) {
		courses.add(course);
		notifyAllObservers();
	}
	
	public void removeCourse(Course course) {
		courses.remove(course);
		notifyAllObservers();
	}
	
	
	//observers
	public void attachObserver(IObserver observer) {
		this.observers.add(observer);
	}
	
	public void notifyAllObservers() {
		for(IObserver observer: this.observers) {
			observer.update(this);
		}
	}
	
	
}