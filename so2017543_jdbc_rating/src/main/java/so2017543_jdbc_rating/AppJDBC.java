package so2017543_jdbc_rating;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.util.Map.Entry;



import java.sql.*;
/**
 * Hello world!
 *
 */
public class AppJDBC 
{
	public static Connection getConnection() {
		String url="jdbc:mysql://localhost:3306/fortraining";
		String user="root";
		String password="mypass";
		Connection myConn=null;
		try {
			myConn=DriverManager.getConnection(url,user,password);
			System.out.println("Connection Established to "+ url);
	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return myConn;
	}
    public static void main(String[] args)
    {	
    	Map<String, Integer> dist = new HashMap<String, Integer>();
        dist.put("Test", 40);
        dist.put("Quiz", 20);
        dist.put("lab work", 10);
        dist.put("Project", 30);
        
        HashMap<Students, StudentScore> m = new HashMap<Students, StudentScore>();
        Students std;
        StudentScore stdsc;
        Statement st=null;
        ResultSet rs=null;
        Connection myConn=getConnection();
        try {
        	st=myConn.createStatement();
        	rs=st.executeQuery("Select * from StudentDB");
        	while(rs.next()) {
        		Integer Sno = rs.getInt("SerialNo");
        		String SName=rs.getString("StudentName");
        		String Subject=rs.getString("Subject");
        		String assignment_category=rs.getString("assignment_category");
        		String date_of_submission=rs.getString("Date_of_Submission");
        		Integer points=rs.getInt("points");
        		std=new Students(SName,Subject,assignment_category);
        		stdsc= new StudentScore(date_of_submission, points);
        		m.put(std,stdsc);
        	}
        }
        catch(Exception ex){}  
          
        
      	Set<Entry<Students, StudentScore>> s1 = m.entrySet();
    	Iterator<Entry<Students, StudentScore>> itr  = s1.iterator();
    	Scanner sc = new Scanner(System.in);
    	String name=sc.nextLine();
    	String subject="Electro Fields";
    	int score_test=0, score_project=0, score_lab=0, score_quiz=0;
    	int count_test=0, count_project=0, count_lab =0, count_quiz=0;
    	String assignment_type=null;
    	while(itr.hasNext())
    	{
    		Entry<Students, StudentScore> map = itr.next();
    		assignment_type=map.getKey().assignment_category;
    		if(map.getKey().student_name.equals(name)&&assignment_type.contains("test_")) {
    			score_test=score_test+map.getValue().points;
    			count_test++;
    		}else if(map.getKey().student_name.equals(name)&&assignment_type.contains("project_")) {
    			score_project=score_project+map.getValue().points;
    			count_project++;
    	
    		}else if(map.getKey().student_name.equals(name)&&assignment_type.contains("lab_")) {
    			score_lab=score_lab+map.getValue().points;
    			count_lab++;
    			
    		}else if(map.getKey().student_name.equals(name)&&assignment_type.contains("quiz_")) {
    			score_quiz=score_quiz+map.getValue().points;
    			count_quiz++;
    			
    		}
    		
    		}
    	System.out.print("Subject: "+ subject);
    	if(count_test!=0) {
    	score_test = score_test*dist.get("Test")/(count_test*100);
    	System.out.print(" Test score: "+ score_test);
    	}else 
    	{
    		System.out.print(" Test score: N/A ");
    	}
    	if(count_project!=0) {
		score_project = score_project*dist.get("Project")/(count_project*100);
		System.out.print(" Project score: "+ score_project);
    	}else 
    	{
    		System.out.print(" Project score: NA ");
    	}
    	if(count_lab!=0) {
		score_lab = score_lab*dist.get("lab work")/(count_lab*100);
		System.out.print(" Lab score: "+ score_lab);
    	} else 
    	{
    		System.out.print(" Lab score: NA ");
    	}
    	if(count_quiz!=0) {
		score_quiz = score_quiz*dist.get("Quiz")/(count_quiz*100);
		System.out.print(" Quiz score: "+ score_quiz);
    	} else 
    	{
    		System.out.print(" Quiz score: NA ");
    	}
    	
    }
	

}
