package so2017543_jdbc_rating;

public class StudentScore {
	String date_of_submission;
	int points;
	public StudentScore(String date_of_submission, int points) {
		
		this.date_of_submission = date_of_submission;
		this.points = points;
	}
	public String getDate_of_submission() {
		return date_of_submission;
	}
	public void setDate_of_submission(String date_of_submission) {
		this.date_of_submission = date_of_submission;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
}
