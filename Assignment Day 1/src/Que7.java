
public class Que7 {

	public static void main(String[] args) {
		
		int i,j,k,cnt;
		
		i=Integer.parseInt(args[0]);
		j=Integer.parseInt(args[1]);
		System.out.println(i+"\n"+j);
		
		for(cnt=j;cnt<=13;cnt++)
		{
			k=i+j;
			System.out.println(k+"\t");
			i=j;
			j=k;
		}

	}

}
