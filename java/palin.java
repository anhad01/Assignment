import java.util.*;

public class palin
{
    public static void main(String args[])
    {
        String str,str1="";
        int i,len;
        char ch;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        str=sc.nextLine();
        len=str.length();
        for(i=len-1;i>=0;i--)
        {
            ch=str.charAt(i);
            str1=str1+ch;
        }
        if (str.equals(str1))
        {
            System.out.println("Pallin");
        }
        else
        System.out.println("Not a Pallindrome");

    }
}