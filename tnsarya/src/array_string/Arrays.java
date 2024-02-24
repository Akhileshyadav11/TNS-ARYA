package array_string;

public class Arrays {

	public static void main(String[] args) 
	{
	int[] myarray= {40,60,100,200}; // prefered/professional way to use array
		
		//int myarray2[]= {3,4,5,6}; // it is also right but not progessional
		
		// some other prefered ways to declare arrays 
		
		/* int[] myarray=new int[3];
		 * int[] myarray={1,2,3,}; // we used this type of array declaration here.
		 * int[] myarray=new int{1,2,3};
		 */
		
       /* array index start from 0. 
         following command will print 200 which is at index 3
        */
		// System.out.println(myarray[3]); 
      	
      	int index=0;
      	while(index<4)
      	{
      		System.out.println(myarray[index]);
      		index++;
      	}

	}

}
