package oopp1;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Alexander", "zhk. Borovo", "0876812347", "alexcho@gmail.com");
		Student student = new Student(Student.FRESHMAN, "Yanislav", 
				"zhk. Lulin", "0873425439", "yanchobancho@abv.bg");
		Employee employee = new Employee("Mistur", 2000 ,"Trifon", 
				"zhk. Lulin 18", "08768777888", "trifon_t@mail.bg");
		Staff staff = new Staff("Principal", "SMG", 8000 ,"Maria", 
				"zhk. Lulin 3", "0876876677", "maria@abv.bg");
		Faculty faculty = new Faculty("7:30 - 19:10" ,"Math" ,"SMG", 1900 ,
				"Borislav", "zhk. Manastirski livadi", "0876876688", "borislav@abv.bg");
		System.out.println(person.toString());
		System.out.println("\n"+ student.toString());
		System.out.println("\n"+ employee.toString());
		System.out.println("\n"+ staff.toString());
		System.out.println("\n"+ faculty.toString());
		
		
	}

}
