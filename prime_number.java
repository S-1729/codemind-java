import java.util.Scanner;
import java.lang.Math;
class primeOrnot
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int flag=0;
        if(n==0 || n==1)
        {
            System.out.print("prime");
        }
        else
        {
            int result=(int)Math.sqrt(n);
            for(int i=2;i<=result;i++)
            {
                if(n%i==0)
                {
                    System.out.print("not a prime");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.print("prime");
            }
        }
    }
}
