import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int even=0,odd=0,c=0;
        while(n>0)
        {
            int rem=n%10;
            if(rem%2==0)
            even++;
            else
            odd++;
            n=n/10;
            c++;
        }
        if(even==c)
        System.out.println("Even");
        else if(odd==c)
        System.out.println("Odd");
        else
        System.out.println("Mixed");
    }
}