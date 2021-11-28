package myTi.Test2.Daniele;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class TestStudent {

	@Test
	void test1() {
		
		LocalDate date = LocalDate.now();
		int dayCorrent = date.getDayOfMonth();
		int monthCorrent = date.getMonthValue();
		
		Student s1 = new Student (null, null, (dayCorrent+1) + "/" + (monthCorrent+1) + "/1996", null);
		Student s2 = new Student (null, null, (dayCorrent+1) + "/" + (monthCorrent-1) + "/1996", null);
		Student s3 = new Student (null, null, (dayCorrent-1) + "/" + (monthCorrent+1) + "/1996", null);
		Student s4 = new Student (null, null, (dayCorrent-1) + "/" + (monthCorrent-1) + "/1996", null);
		Student s5 = new Student (null, null, (dayCorrent+1) + "/" + monthCorrent + "/1996", null);
		Student s6 = new Student (null, null, (dayCorrent-1) + "/" + monthCorrent + "/1996", null);
		
		assertEquals(s1.age(), 24);
		assertEquals(s2.age(), 25);
		assertEquals(s3.age(), 24);
		assertEquals(s4.age(), 25);
		assertEquals(s5.age(), 24);
		assertEquals(s6.age(), 25);
		
	}
	
	@Test
	void test2() {
		
		Student s1 = new Student (null, null, null, "Algebra 24; Storia 22; Fisica 30" );
		Student s2 = new Student (null, null, null, "Base di dati 25; Algebra 19; Geometria 18");
		Student s3 = new Student (null, null, null, "Fisica II 20");
		
		assertEquals(s1.avg_grade(s1.listGrades()), 25,33);
		assertEquals(s2.avg_grade(s2.listGrades()), 20,67);
		assertEquals(s3.avg_grade(s3.listGrades()), 20);
		
	}

}
