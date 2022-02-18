package classes_and_objects;

public class StudentUse {

	public static void main(String[] args) {
		Student s1 = new Student();

		System.out.println(s1.getrollno() + " " + s1.getName());

//		s1.rollno = -10;
//		s1.name = "Pranab";

		s1.setName("Pranab");
		s1.setRollNo(1);

	}

}
