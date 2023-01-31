import java.util.Scanner;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int vowel=0,spaces=0,digits=0,cons=0;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c==' ')
            spaces++;
            else if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            vowel++;
            else if((int)c >=48 && (int)c<=57)
            digits++;
            else
            cons++;
        }
        System.out.println("Vowels: "+vowel);
        System.out.println("Consonants: "+cons);
        System.out.println("Digits: "+digits);
        System.out.println("White spaces: "+spaces);
    }
}