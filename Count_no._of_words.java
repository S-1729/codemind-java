import java.util.Scanner;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int c=1;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            c++;
        }
        System.out.println(c);
    }
}