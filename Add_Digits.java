import java.util.Scanner;
class Main{
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
                sum+=rem;
                n/=10;
            }
            n=sum;
        }
        System.out.print(n);
    }
}