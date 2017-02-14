public class Student
{
	private String name;
	private int age;
	private double grade;
	private static int numStudents;
	
	public Student()
	{
		this("Bao" , 12, 93.0);
	}
	
	public Student(String a, int x)
	{
		name = a;
		age = x;
		grade = 100.0;
		numStudents++;
	}
	
	public Student(String a, int x, double s)
	{
		name = a;
		age = x;
		grade = s;
		numStudents++;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getGrade()
	{
		return grade;
	}
	
	public int getNumStudents()
	{
		return numStudents;
	}
	
	public void setName(String a)
	{
		name = a;
	}
	
	public void setAge(int x)
	{
		age = x;
	}
	
	
	public void setGrade(double s)
	{
		grade = s;
	}
	
	public String toString()
	{
		return "name: " + name + " age: " + age + " grade: " + grade;
	}
}
	
	