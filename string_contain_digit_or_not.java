import java.util.Scanner;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        int cnt=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
            cnt++;
        }
        if(cnt>0)
        System.out.println("Contains "+cnt+" digit");
        else
        System.out.println("Doesn't contain digit");
    }
}