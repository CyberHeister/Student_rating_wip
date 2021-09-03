package so2017543_jdbc_rating;

public class Students {
	String student_name;
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAssignment_category() {
		return assignment_category;
	}
	public void setAssignment_category(String assignment_category) {
		this.assignment_category = assignment_category;
	}
	String subject;
	String assignment_category;
	
	public Students(String student_name, String subject, String assignment_category) {
		
		this.student_name = student_name;
		this.subject = subject;
		this.assignment_category = assignment_category;
		
	}
	public String ToString(){
        return this.student_name+" "+this.subject+" "+this.assignment_category;
    }
	
	
}
