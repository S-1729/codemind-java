import java.util.Scanner;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int max=0;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if((int)c>max)
            max=(int)c;
        }
        System.out.println((char)max);
    }
}