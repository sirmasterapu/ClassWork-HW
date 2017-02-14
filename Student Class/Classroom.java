public class Classroom
{

	private Student[] room;
	


//constructors

	public Classroom()
	{
		 room = new Student[10];
		//System.out.println(room.length);
	}


	public Classroom( int size )
	{
		room = new Student[size];
		for(int i = 0 ; i < room.length; i++)
		{
			room[i] = new Student();
		}
	}

//modifiers
	public void setStudent(Student x, int index)
	{
		room[index] = x;
	}
	
	
//accessors

	public int getSize()
	{
		return room.length;
	}
	
	public void printAllStudents()
	{
		for(int i = 0; i < getSize(); i++)
		{
			if( room[i] != null )
				System.out.println(room[i]);
			
		}
	}
	
	public Student getStudent(int index)
	{
		return room[index];
	}
	
	public int studentsAbove16()
	{
		int amountOfStudents = 0;
		for(Student s: room)
		{
			if(s.getAge() > 16)
				amountOfStudents++;
		}	
		return amountOfStudents;
	}		
	
}		