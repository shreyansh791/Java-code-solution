package pattern;

public class PyramidPattern1 {
public static void main(String[] args) {
	for(int i=4;i>=0;i--)
	{
		for(int j=0;j<=4;j++)
		{
			if(i>j)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print((j-i)+" ");
			}
		}
		System.out.println();
	}
}
}
