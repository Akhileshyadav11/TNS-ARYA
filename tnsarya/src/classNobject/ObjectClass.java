package classNobject;

public class ObjectClass {

	public static void main(String[] args)
	{
		StudentClass mark=new StudentClass();// Here,mark is object of ClassStudent
		mark.setId(1);
		mark.setName("Akhilesh");
		mark.setAge(22);
		
		System.out.println(mark.getName()+" is "+mark.getAge()+" years old.");
		
		StudentClass mark1=new StudentClass();
		mark1.setId(2);
		mark1.setName("Aradhana");
		mark1.setAge(21);
		
		System.out.println(mark1.getName()+" is "+mark1.getAge()+" years old.");
	}

}
