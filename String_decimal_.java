import java.util.Scanner;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int k=0;k<t;k++)
        {
            String str=scan.next();
            int c=0;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)>='0' && str.charAt(i)<='9')
                c++;
            }
            if(c!=str.length())
            System.out.println("False");
            else
            System.out.println("True");
        }
    }
}