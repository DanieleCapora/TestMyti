package example;

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
	
	public String toString() {
		return "the student " + firstname + " " + lastname + " birth at "
					+ birthday + " has the followed grades: " + grades;
	}

}
