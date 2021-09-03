package so20171543.corejava.rating.SO20171543_CoreJAVA_Rating;

import java.util.*;
import java.util.Map.Entry;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	Map<String, Integer> dist = new HashMap<String, Integer>();
        dist.put("Test", 40);
        dist.put("Quiz", 20);
        dist.put("lab work", 10);
        dist.put("Project", 30);
       
        HashMap<Students, StudentScore> m = new HashMap<>();
        m.put(new Students("Ananth","Electro Fields", "test_1"), new StudentScore("21-jul-16", 100));
    	m.put(new Students("Bhagth","Electro Fields", "test_1"), new StudentScore("21-jul-16", 78));
    	m.put(new Students("Chaya", "Electro Fields", "test_1"), new StudentScore("21-jul-16", 68));
    	m.put(new Students("Eshartha", "Electro Fields", "test_1"), new StudentScore("21-jul-16", 87));
    	m.put(new Students("Bhagth", "Electro Fields", "quiz_1"), new StudentScore("22-jul-16", 20));
    	m.put(new Students("Chaya", "Electro Fields", "lab_1"), new StudentScore("23-jul-16", 10));
    	m.put(new Students("Ananth", "Electro Fields", "project_1"), new StudentScore("24-jul-16", 100));
    	m.put(new Students("Davanth", "Electro Fields", "quiz_2"), new StudentScore("25-jul-16", 50));
    	m.put(new Students("Bhagth", "Electro Fields", "test_1"), new StudentScore("21-jul-16", 100));
    	Set<Entry<Students, StudentScore>> s1 = m.entrySet();
    	Iterator<Entry<Students, StudentScore>> itr  = s1.iterator();
    	Scanner sc = new Scanner(System.in);
    	String name=sc.nextLine();
    	String subject="Electro Fields";
    	int score_test = 0, score_project = 0, score_lab=0, score_quiz=0;
    	int count_test = 0, count_project=0, count_lab =0, count_quiz=0;
    	String assignment_type=null;
    	while(itr.hasNext())
    	{
    		Entry<Students, StudentScore> map = itr.next();
    		assignment_type=map.getKey().assignment_category;
    		if(map.getKey().student_name.equals(name)&&assignment_type.contains("test")) {
    			score_test=score_test+map.getValue().points;
    			count_test++;
    		}else if(map.getKey().student_name.equals(name)&&assignment_type.contains("project")) {
    			score_project=score_project+map.getValue().points;
    			count_project++;
    	
    		}else if(map.getKey().student_name.equals(name)&&assignment_type.contains("lab")) {
    			score_lab=score_lab+map.getValue().points;
    			count_lab++;
    			
    		}else if(map.getKey().student_name.equals(name)&&assignment_type.contains("quiz")) {
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
    	
		
//		if(assignment_type.contains("test")) {
//    		System.out.print("Subject: "+ subject+"Test score: "+ score_test);
//    	}else if(assignment_type.contains("project")) {
//        	System.out.print("Subject: "+ subject+"Project score: "+ score_project);
//        }else if(assignment_type.contains("lab")) {
//        	System.out.print("Subject: "+ subject+"Lab score: "+ score_lab);
//        }else if(assignment_type.contains("quiz")) {
//        	System.out.print("Subject: "+ subject+"Quiz score: "+ score_quiz);
//        }
//		
    		}
    	
//    	if(assignment_type.contains("test")) {
//    		(40/count)*100/
//    	}
////    	
//    	
//    	computeData("Bhagth", m);
//    }
//    public static void computeData(String name, HashMap<Students, StudentScore> map1){
//    	map1.
//    
//    	if(map1.containsValue(name)) {
//    		String s = "";
//    		//s=s+map1.get(name).assignment_category;
//    		System.out.println(s);
//    	}
//    	
//        
//    }
	

}