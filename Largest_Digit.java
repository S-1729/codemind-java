import java.util.Scanner;
class largestDigit
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int max=0;
        while(n>0)
        {
            if((n%10)>max)
                max=n%10;
            n/=10;
        }
        System.out.println(max);
        
    }
}
