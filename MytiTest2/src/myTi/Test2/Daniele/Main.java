package myTi.Test2.Daniele;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		int dayCorrent = date.getDayOfMonth();
		int monthCorrent = date.getMonthValue();
		int yearCorrent = date.getYear();
		
		Student studenti = new Student(null, null, (dayCorrent+1) + "/" + (monthCorrent+1) + "/1996", "mate 29; italiano 23; storia 24");

		System.out.println("Età:" + studenti.age());
		
		System.out.println(studenti.avg_grade(studenti.listGrades()));
		
	}

}
