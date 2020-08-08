import java.io.*;
class Funct_6
{
    static void check(String s)
    {
        int flag=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char ch=s.charAt(i);
            char ch1=s.charAt(i+1);
            if(ch1==(char)(ch+1))
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        System.out.println("MAGIC");
        else
        System.out.println("NOT");
    }
}
          