public class ClassroomRunner
{


	public static void main(String[] args)
	{
	
		Student s1 = new Student();
		Student s2 = new Student( "Apurva", 16 );
		Student s3 = new Student( "Fradkin", 17, 50.0 );
	
		System.out.println(s1);
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getGrade());
		System.out.println();	
		
		System.out.println(s2);
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getGrade());
		System.out.println();
		
		System.out.println(s3);
		System.out.println(s3.getName());
		System.out.println(s3.getAge());
		System.out.println(s3.getGrade());
		System.out.println();	
		
		Classroom compSci = new Classroom();
		
		compSci.setStudent(s1, 0);
		compSci.setStudent(s2, 1);
		compSci.setStudent(s3, 2);
		

		
		
		System.out.println("Computer Science class List: ");
		compSci.printAllStudents();
			
			
		
		
		
	
	}
	
}