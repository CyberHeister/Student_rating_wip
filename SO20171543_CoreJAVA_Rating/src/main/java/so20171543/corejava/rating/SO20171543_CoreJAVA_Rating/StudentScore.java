package so20171543.corejava.rating.SO20171543_CoreJAVA_Rating;

public class StudentScore {
	String date_of_submission;
	Integer points;
	public StudentScore(String date_of_submission, Integer points) {
		
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
