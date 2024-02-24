package controlstatement;

public class Switch {

	public static void main(String[] args) 
	{
int score=65;
		
		/*if((score>=35))
		{
			System.out.println("The condition is true");
			
		}  
		else
		{
			System.out.println("condition is false");
		}
		*/
		switch(score)
		{
		case 90:System.out.println("Very Good");
		break;
		case 65:System.out.println("Good");
		break;
		case 40:System.out.println("Ok");
		break;
		default:System.out.println("Grades not defined");
		break;
		}

	}

}
