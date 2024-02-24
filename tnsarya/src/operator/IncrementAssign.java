package operator;

public class IncrementAssign {

	public static void main(String[] args) 
	{
		int x=10;
		//x=x+1; 
		//if we want to add 5 to x
		x+=5; // x=x+5;
		//or we can do 
		x++; // post increment
		System.out.println(x);
		
		// ++x is Pre-increment
		System.out.println(++x);  
	
 
	}

}
