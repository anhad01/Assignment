import java.util.*;
public class rvowel 
{
    public static void main (String args[])
    {
        String str;
        int i,len;
        StringBuilder vow = new StringBuilder();
        StringBuilder notv = new StringBuilder();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string");
        str =sc.nextLine();
        str=str.toLowerCase();
        len=str.length();
        char []ch = str.toCharArray();
        for(i=0;i<len;i++)
        {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            {
                vow.append(ch[i]);
            }
            else
            {
                notv.append(ch[i]);
            }

        }
        System.out.println("After Vowel Removal = " +notv.toString());
    }
}
