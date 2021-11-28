package myTi.Test2.Daniele;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Student {
	
	private String firstname;
	private String lastname;
	private String birthday; // mm/dd/yyyy
	private String grades; // vote1, vote2, vote3
	
	public Student(String f, String l, String b, String g) {
		firstname = f;
		lastname = l;
		birthday = b;
		grades = g;
	}
	
	public int age() {
		
		LocalDate date = LocalDate.now();
		int dayCorrent = date.getDayOfMonth();
		int monthCorrent = date.getMonthValue();
		int yearCorrent = date.getYear();
		
		int day = Integer.parseInt(birthday.substring(0, 2));
		int month = Integer.parseInt(birthday.substring(3, 5));
		int year = Integer.parseInt(birthday.substring(6, 10));
		
		int age = yearCorrent- year;
		
		if(monthCorrent < month) return age - 1;
		else if(monthCorrent == month && dayCorrent < day) return age - 1;
		else return age;
		
	}
	
	public ArrayList<Integer> listGrades() {
		
		StringBuilder g = new StringBuilder(grades);
		ArrayList<Integer> gradesList = new ArrayList<Integer>();
		
		while(!g.isEmpty()) {
		int comma = g.indexOf(";");
		String s;
		if(comma != -1) {
			s = g.substring(0, comma);
		}else {
			s = g.substring(0, g.length());
		}
		
		StringBuilder sb = new StringBuilder(s.length());
		    for(int i = 0; i < s.length(); i++){
		        char c = s.charAt(i);
		        if(c > 47 && c < 58){
		           sb.append(c);
		        }
		    }
		gradesList.add(Integer.parseInt(sb.toString()));
		    
		if(comma != -1) {
			g.delete(0, comma + 1);
		}else {
			g.delete(0, g.length());
		}
		
		}
		return gradesList;
	}
	
	public double avg_grade(ArrayList<Integer> gradesList) {
		
		int summ = 0;
		int counter = 0;
		
		for (Integer i : gradesList) {
			summ = summ + i;
			counter++;
		}
		
		double avg = Math.round(((double)summ/counter)*100.0)/100.0;
		return avg;
		
	}
	
	
	
	

}
