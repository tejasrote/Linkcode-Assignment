import java.util.Scanner;
public class verify {
	Scanner sc=new Scanner(System.in);
	boolean b=false; 
	public void length(Rectangle1 rect) {
		if((rect.getRectLength()>0.0)&&(rect.getRectLength()<20.0))
		{
			b=true;
			rect.setRectLength(0);
			rect.setRectBreadth(0);
		}
		else {
			System.out.println("Enter value greater than 0.0 and less than 20.0 ");
		}
	}

}
