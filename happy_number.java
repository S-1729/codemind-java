import java.util.Scanner;
class happyNumber
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        while(n>9)
        {
            int sum=0;
            while(n>0)
            {
                int rem=n%10;
                sum+=rem*rem;
                n/=10;
            }
            n=sum;
        }
        if(n==1 || n==7)
        System.out.println("True");
        else
        System.out.println("False");
    }
}