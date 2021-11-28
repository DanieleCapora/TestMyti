package example;

import java.io.IOException;
import java.util.ArrayList;

import javax.ws.rs.*;

@Path("/prova")
public class WebService {
	
	@GET
	@Path("/try")
	public String prova() {
		return "HelloWorld";
	}
	
	ArrayList<Student> listStudent= new ArrayList<Student>();

	@POST
	@Path("/newUser")
	public void newUser(@FormParam("id") String id,
						@FormParam("firstName") String firstName,
						@FormParam("lastName") String lastName,
						@FormParam("birthday") String birthday,
						@FormParam("grades") String grades) throws IOException {
		
	 Student s = new Student(firstName, lastName, birthday, grades);
	 listStudent.add(s);
	 
	 }
	
	@GET
	@Path("retriverUser")
	public String retriverUser() {
		
		return listStudent.toString();
		
	}
	
	
}


