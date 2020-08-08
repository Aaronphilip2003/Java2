import java.util.*;
class Double1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String s=sc.nextLine();
        String s1="";int flag=232;
        for(int i=0;i<s.length()-1;i++)
        {
           if(s.charAt(i)==s.charAt(i+1)&&(s.charAt(i)!=' '))
           {
           flag=1;
           break;
        }
    }
        if(flag==1)
        System.out.println("Double Letter Sequence:");
        else
        System.out.println("NOT");
    }
}