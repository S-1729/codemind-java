import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n>=3 && n<=100)
		{
		for(int i=1;i<=n;i++)
		{
		    for(int  j=1;j<=i;j++)
		    {
		            System.out.print("*");
		     }
		    System.out.println();
		}
		for(int i=1;i<n;i++)
		{
		    for(int j=n;j>i;j--)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		}
		else{
		    System.out.print("The pattern is not possible");
		}
	}
}