import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        int c1=0,c2=0,c3=0,c4=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='L')
            c1++;
            else if(str.charAt(i)=='R')
            c2++;
            else if(str.charAt(i)=='U')
            c3++;
            else
            c4++;
        }
        if(c1==c2 && c3==c4)
        System.out.println("True");
        else
        System.out.println("False");
    }
}