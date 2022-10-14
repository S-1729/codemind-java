import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0,temp=n;
        while(n>0)
        {
            int product=1;
            int rem=n%10;
            for(int i=1;i<=rem;i++)
            {
                product*=i;
            }
            sum+=product;
            n/=10;
        }
        if(temp==sum)
        System.out.print("The number "+temp+" is a strong number");
        else
        System.out.print("The number "+temp+" is not a strong number");
    }
}