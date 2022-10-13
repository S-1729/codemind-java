import java.util.Scanner;
import java.lang.Math;
class Gcd
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int minimum=Math.min(n,m);
        for(int i=minimum;i>=1;i--)
        {
            if(n%i==0 && m%i==0)
            {
                System.out.print(i);
                break;
            }
        }
    }
}