import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int k=scan.nextInt();
        int c=0;
        for(int i=a;i<=b;i++)
        {
            if(i%k==0)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}