package operator;

public class Logical 
{
	public static void main(String[] args)
	{
		int subject1=44;
		int subject2=50;
		
		// &&-->AND opertor
		// ||-->OR operator
		if((subject1>=35)&&(subject2>=35)) {
			System.out.println("The condition is True.");
			
		}
		else {
			System.out.println("The condition is false."); 
		}
	}

}
