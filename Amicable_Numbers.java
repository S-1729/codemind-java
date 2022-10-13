import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int sum1=0,sum2=0;
		for(int i=1;i<n;i++)
		{
		    if(n%i==0)
		    {
		        sum1+=i;
		    }
		}
		for(int i=1;i<m;i++)
		{
		    if(m%i==0)
		    {
		        sum2+=i;
		    }
		}
		if(n==sum2 && m==sum1)
		System.out.print("Amicable");
		else
		System.out.print("Not Amicable");
	}
}