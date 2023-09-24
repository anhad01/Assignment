import java.util.*;
public class count 
{
    public static void main(String args[])
    {
        String str;
        int i,len,a=0,b=0,c=0;
        char ch;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the string");
        str =sc.nextLine();
        str=str.toLowerCase();
        len=str.length();
        for(i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if(ch==32)
            {
                a++;
            }
            else if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
            {
                b++;
            }
            else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                c++;
            }

        }
        System.out.println("No.of Vowels="+c);
        System.out.println("No.of Consonants="+b);
        System.out.println("No.of Spaces ="+a);
    }
}
