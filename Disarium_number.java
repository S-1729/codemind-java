import java.util.Scanner;
import java.lang.Math;
class DisariumNumber
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int temp=n,temp2=n,sum=0,c=0,rem;
        while(temp>0)
        {
            temp/=10;
            c++;
        }
        while(temp2>0)
        {
            rem=temp2%10;
            sum+=(int)Math.pow(rem,c);
            temp2/=10;
            c--;
        }
        if(n==sum)
        System.out.println("True");
        else
        System.out.println("False");
    }
}