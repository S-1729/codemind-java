import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0,product=1;
        while(n>0)
        {
            int rem=n%10;
            sum+=rem;
            product*=rem;
            n/=10;
        }
        System.out.print(product-sum);
    }
}