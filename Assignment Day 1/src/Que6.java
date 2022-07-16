
public class Que6 {

	public static void main(String[] args) {
		
		System.out.println("Your first argument is: "+args[1]);
		
		System.out.println("Length of argument is: "+args.length); //string count starts from zero so "-1"
		
		int i=0,j=args.length-1;
		
		do
		{
		if(i==j)
		{
			i++;
			j--;
		}
		else
		{
			System.out.println("Not pallindrome.");
		}
		System.out.println("Palindrome!!");
		}while(i==args.length/2);
		
	}

}
