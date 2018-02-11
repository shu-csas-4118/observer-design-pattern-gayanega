public class LastNameObserver implements IObserver {
	
	public LastNameObserver() {
		
	}
	
	public void update(Student student) {
		System.out.println("Student's last name is " + student.getLastName());
	}

}