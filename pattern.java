package thursdayLab1;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern(5);
	}
	static void Pattern(int x)
	{
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
		                }
		        System.out.println();
		}
	}
}
