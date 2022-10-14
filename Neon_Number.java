import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0;
        int sq=n*n;
        while(sq>0)
        {
            int rem=sq%10;
            sum+=rem;
            sq/=10;
        }
        if(n==sum)
        System.out.print("Neon Number");
        else
        System.out.print("Not Neon Number");
    }
}