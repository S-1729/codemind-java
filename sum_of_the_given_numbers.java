import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=scan.nextInt();
            int b=scan.nextInt();
            int sum=a+b;
            System.out.println(sum);
        }
    }
}
