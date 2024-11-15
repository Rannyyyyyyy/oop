
public class EncapsulationSample
{
	public static void main(String[] args) {
	 Student student1 = new Student();
	 student1.setId(1234);
	 student1.setname("Student_1");
	 
	 System.out.println("Student Id: " + student1.getId());
	 System.out.println("Student Id: " + student1.getname());
	 System.out.println();
	 	 
	 Book book1 = new Book();
	 book1.setbooknumber(1);
	 book1.setTitle("Noli Me Tangere");
	 book1.setname("Jose Rizal");
	 book1.setprice( 500.00f);
	 
	 System.out.println("Book number: " + book1.getBookNumber());
	 	 System.out.println("Book Title: " + book1.getTitle());
	 	 System.out.println("Author: " + book1.getAuthor());
	 	 System.out.println("Book Price: " + book1.getPrice());
	}
}

 
    
