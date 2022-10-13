import java.util.Scanner;
class reverse
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int rev=0;
        while(n>0)
        {
            rev=rev*10+(n%10);
            n/=10;
        }
        System.out.print(rev);
    }
}
