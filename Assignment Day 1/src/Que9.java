
public class Que9 {
	
	public static void main(String[] args) {
	
	int sum=0;
	int avg=0;
	int smallest=0;
	
	int arr[] = new int[]{3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
	
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	
	avg=sum/14;
	
	smallest=arr[0];
	
	for(int i=0;i<arr.length;i++)
	{
		if(smallest>arr[i])
		{
			smallest=arr[i];
		}
	}
	
	arr[15]=sum;
	arr[16]=avg;
	arr[17]=smallest;
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	}
}
